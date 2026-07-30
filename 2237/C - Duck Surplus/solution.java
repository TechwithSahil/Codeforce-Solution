import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Scanner helps us read input from the jury/user
        Scanner scanner = new Scanner(System.in);
 
        // Codeforces problems use 't' for the total number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
 
            // Run our solution for every single testcase
            while (t-- > 0) {
                int n = scanner.nextInt();
                
                long ans = 0; // Tracks the size of our moving pile
                long maxSeen = 0; // Tracks the maximum element size seen so far
 
                for (int i = 0; i < n; i++) {
                    long currentPile = scanner.nextLong();
 
                    // Update the largest pile size seen up to this point
                    if (currentPile > maxSeen) {
                        maxSeen = currentPile;
                    }
 
                    // If our cascading left pile is larger than the current pile,
                    // it overflows and absorbs it.
                    if (ans > currentPile) {
                        ans = ans + currentPile;
                    } 
                    // Otherwise, the pile resets to the current element.
                    else {
                        ans = currentPile;
                    }
 
                    // The answer cannot be smaller than the largest individual
                    // starting pile encountered up to this position.
                    if (ans < maxSeen) {
                        ans = maxSeen;
                    }
                }
 
                // Output the answer for the current test case
                System.out.println(ans);
            }
        }
        scanner.close();
    }
}