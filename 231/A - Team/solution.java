import java.util.Scanner;
 
public class Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the total number of problems
        int n = scanner.nextInt();
        int solvedCount = 0;
        
        // Loop through each problem
        for (int i = 0; i < n; i++) {
            int petya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();
            
            // Check if at least two friends are sure about the solution
            if (petya + vasya + tonya >= 2) {
                solvedCount++;
            }
        }
        
        // Print the final result
        System.out.println(solvedCount);
        
        scanner.close();
    }
}