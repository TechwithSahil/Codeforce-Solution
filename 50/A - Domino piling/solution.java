import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read the dimensions of the board
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        
        // Calculate the maximum number of dominoes
        // Integer division automatically handles rounding down (floor)
        int maxDominoes = (M * N) / 2;
        
        // Print the final result
        System.out.println(maxDominoes);
        
        // Close the scanner object
        scanner.close();
    }
}