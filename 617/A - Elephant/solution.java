import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        int steps = x / 5;
        
        // Only add 1 if there is a remaining distance left over
        if (x % 5 > 0) {
            steps = steps + 1;
        }
        
        System.out.println(steps);
        scan.close();
    }
}