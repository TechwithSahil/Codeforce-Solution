import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of friends
        int h = sc.nextInt(); // height of the fence
        
        int width = 0; // total width required
        
        // Check each friend's height
        for(int i = 0; i < n; i++) {
            int height = sc.nextInt();
            
            if(height > h) {
                width += 2; // Taller than fence, needs 2 units of width
            } else {
                width += 1; // Shorter or equal, needs 1 unit of width
            }
        }
        
        System.out.println(width); // print total width
        
        sc.close();
    }
}