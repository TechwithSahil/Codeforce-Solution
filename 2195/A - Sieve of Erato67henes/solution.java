import java.util.Scanner;
 
public class Word {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        // 1. Read the number of test cases first
        int t = scanner.nextInt();
        
        // 2. Loop through all test cases
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt();
            
            boolean has67 = false;
            
            // Declares an array that can hold n integers
            int[] myArray = new int[n]; 
            
            // Loop runs from 0 to n-1
            for (int i = 0; i < n; i++) {
                myArray[i] = scanner.nextInt(); 
                
                // Fixed Logic: Just check for 67
                if (myArray[i] == 67) {
                    has67 = true;
                }
            }
 
            // Output the result for the current test case
            if (has67) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
        scanner.close();
    }
}