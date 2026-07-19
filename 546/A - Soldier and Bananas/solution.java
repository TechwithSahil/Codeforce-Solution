import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long k = scanner.nextLong();
        long n = scanner.nextLong();
        long w = scanner.nextLong();
        
        long totalCost = k * (w * (w + 1)) / 2;
        
        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}