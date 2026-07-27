import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read number of test cases
        
        while (t > 0) {
            int n = sc.nextInt(); // Read length of string
            String s = sc.next();    // Read the string itself
            
            // Call our helper method to check if we can win
            if (canWin(s, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
 
    public static boolean canWin(String s, int n) {
        // Create an array to act like a temporary container
        char[] container = new char[n];
        int size = 0; // Tracks how many characters are currently inside
        
        for (int i = 0; i < n; i++) {
            char current = s.charAt(i);
            
            // If container is not empty and current letter matches the last letter inside
            if (size > 0 && container[size - 1] == current) {
                size--; // Remove the last letter (they destroy each other)
            } else {
                container[size] = current; // Add the current letter to the container
                size++;
            }
        }
        
        // If size is 0, all characters were cleared perfectly
        return size == 0;
    }
}