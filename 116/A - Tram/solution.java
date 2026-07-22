import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of stops
        int n = sc.nextInt();
        
        int currentPassengers = 0;
        int maxCapacity = 0;
        
        // Loop through each stop
        while (n > 0) {
            int a = sc.nextInt(); // Passengers exiting
            int b = sc.nextInt(); // Passengers entering
            
            // Calculate current passengers after exits and entries
            currentPassengers -= a;
            currentPassengers += b;
            
            // Update the maximum capacity seen so far
            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
            
            // Decrement n to avoid infinite loop
            n--;
        }
        
        // Print the final required capacity
        System.out.println(maxCapacity);
        
        sc.close();
    }
}