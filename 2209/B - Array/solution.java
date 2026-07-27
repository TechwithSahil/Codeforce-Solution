import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of test cases
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        // Loop through every test case
        while (t-- > 0) {
            // Read the size of the array
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            // Fill the array with input values
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Loop through each element to calculate the answer
            for (int i = 0; i < n; i++) {
                int greaterCount = 0;
                int lessCount = 0;
                
                // Count elements to the right of index i
                for (int j = i + 1; j < n; j++) {
                    if (a[j] > a[i]) {
                        greaterCount++;
                    } else if (a[j] < a[i]) {
                        lessCount++;
                    }
                }
                
                // Pick the larger count between greaterCount and lessCount
                int ans = Math.max(greaterCount, lessCount);
                
                // Print the result for this index
                if (i == n - 1) {
                    System.out.print(ans); // Last number of the row
                } else {
                    System.out.print(ans + " "); // Space separated numbers
                }
            }
            // Move to the next line for the next test case
            System.out.println();
        }
        
        scanner.close();
    }
}