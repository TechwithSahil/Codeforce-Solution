import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // 1. Read the number of columns (n) and quests (m)
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        // 2. Read the heights of the columns (using 1-based indexing for simplicity)
        long[] heights = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            heights[i] = scanner.nextLong();
        }
 
        // 3. Compute total damage when moving from Left to Right
        long[] leftToRight = new long[n + 1];
        for (int i = 1; i < n; i++) {
            long damage = 0;
            if (heights[i] > heights[i + 1]) {
                damage = heights[i] - heights[i + 1]; // Damage taken from falling down
            }
            leftToRight[i + 1] = leftToRight[i] + damage;
        }
 
        // 4. Compute total damage when moving from Right to Left
        long[] rightToLeft = new long[n + 1];
        for (int i = n; i > 1; i--) {
            long damage = 0;
            if (heights[i] > heights[i - 1]) {
                damage = heights[i] - heights[i - 1]; // Damage taken from falling down
            }
            rightToLeft[i - 1] = rightToLeft[i] + damage;
        }
 
        // 5. Answer each quest query
        for (int j = 0; j < m; j++) {
            int start = scanner.nextInt();
            int target = scanner.nextInt();
 
            if (start < target) {
                // Moving right
                long totalDamage = leftToRight[target] - leftToRight[start];
                System.out.println(totalDamage);
            } else {
                // Moving left
                long totalDamage = rightToLeft[target] - rightToLeft[start];
                System.out.println(totalDamage);
            }
        }
 
        scanner.close();
    }
}