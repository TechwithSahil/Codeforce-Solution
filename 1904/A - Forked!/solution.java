import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        // Scanner is the easiest way for beginners to read input
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t > 0) {
            // Read knight moves
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            // Read King's position
            long xK = sc.nextLong();
            long yK = sc.nextLong();
            
            // Read Queen's position
            long xQ = sc.nextLong();
            long yQ = sc.nextLong();
            
            // Arrays representing the 8 directions a knight can move
            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};
            
            // HashSets to store the coordinates as Text (Strings)
            HashSet<String> kingAttackers = new HashSet<>();
            HashSet<String> queenAttackers = new HashSet<>();
            
            // Generate all 8 potential attacker locations
            for (int i = 0; i < 8; i++) {
                // Calculate actual grid coordinates
                long kX = xK + dx[i];
                long kY = yK + dy[i];
                
                long qX = xQ + dx[i];
                long qY = yQ + dy[i];
                
                // Convert coordinates into a text format like "X,Y"
                // This automatically removes duplicates (e.g., if a == b)
                kingAttackers.add(kX + "," + kY);
                queenAttackers.add(qX + "," + qY);
            }
            
            // Count how many text strings exist in BOTH sets
            int count = 0;
            for (String pos : kingAttackers) {
                if (queenAttackers.contains(pos)) {
                    count++;
                }
            }
            
            // Print the final answer for this test case
            System.out.println(count);
            
            t--; // Move to the next test case
        }
        
        sc.close();
    }
}