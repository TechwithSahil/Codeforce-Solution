import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n (number of children) and t (time in seconds)
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        
        // Read the initial queue arrangement
        String s = scanner.next();
        char[] queue = s.toCharArray();
        
        // Simulate the queue transformation for t seconds
        for (int sec = 0; sec < t; sec++) {
            for (int i = 0; i < n - 1; i++) {
                // If a boy ('B') is right in front of a girl ('G')
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap them
                    queue[i] = 'G';
                    queue[i + 1] = 'B';
                    
                    // Skip the next index to avoid swapping the same boy twice in 1 second
                    i++; 
                }
            }
        }
        
        // Print the final arrangement
        System.out.println(new String(queue));
        
        scanner.close();
    }
}