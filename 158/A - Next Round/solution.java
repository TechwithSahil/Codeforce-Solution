import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Read the scores into an array
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }
        
        // The k-th finisher is at index k - 1
        int targetScore = scores[k - 1];
        int count = 0;
        
        // Count eligible participants
        for (int i = 0; i < n; i++) {
            // Must be greater than or equal to k-th score AND strictly positive
            if (scores[i] >= targetScore && scores[i] > 0) {
                count++;
            }
        }
        
        // Output the final count
        System.out.println(count);
        
        scanner.close();
    }
}