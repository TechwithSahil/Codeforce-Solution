import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        boolean isHard = false; // Start by assuming it's EASY
        
        // Loop through all opinions
        for (int i = 0; i < n; i++) {
            int opinion = sc.nextInt();
            
            // If even one person says it's hard, flip the flag
            if (opinion == 1) {
                isHard = true; 
            }
        }
        
        // Print based on the flag
        if (isHard) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
        
        sc.close();
    }
}