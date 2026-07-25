import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of friends
        int n = scanner.nextInt();
        
        // Array to store the giver for each receiver (1-indexed)
        int[] givers = new int[n + 1];
        
        // Read the inputs and invert the relationship
        for (int i = 1; i <= n; i++) {
            int receiver = scanner.nextInt();
            givers[receiver] = i; 
        }
        
        // Print the final result space-separated
        for (int i = 1; i <= n; i++) {
            System.out.print(givers[i] + " ");
        }
        
        scanner.close();
    }
}