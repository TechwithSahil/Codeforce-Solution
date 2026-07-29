import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            // 2. Read the length of the array
            int n = sc.nextInt();
            int[] a = new int[n];
            
            // 3. Fill the array with input values
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            int maxMex = 0;
            
            // 4. Try making each element 'a[targetIndex]' equal to 0
            for (int targetIndex = 0; targetIndex < n; targetIndex++) {
                int targetValue = a[targetIndex];
                
                // This array tracks which numbers from 0 to n we have seen
                boolean[] seen = new boolean[n + 1];
                
                // Shift all numbers by subtracting the targetValue
                for (int i = 0; i < n; i++) {
                    int shiftedValue = a[i] - targetValue;
                    
                    // We only care about numbers between 0 and n
                    if (shiftedValue >= 0 && shiftedValue <= n) {
                        seen[shiftedValue] = true;
                    }
                }
                
                // Find the first number starting from 0 that is missing
                int currentMex = 0;
                while (currentMex <= n && seen[currentMex]) {
                    currentMex++;
                }
                
                // Save the highest MEX we have seen so far
                if (currentMex > maxMex) {
                    maxMex = currentMex;
                }
            }
            
            // 5. Print the best answer for this test case
            System.out.println(maxMex);
        }
        
        sc.close();
    }
}