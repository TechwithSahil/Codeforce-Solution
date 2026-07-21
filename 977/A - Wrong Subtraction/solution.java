import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong(); 
        long k = sc.nextLong(); 
        while(k > 0) {
            if(n % 10 == 0) {
                n = n / 10;  // IF LAST DIGIT IS 0
            } else {
                n = n - 1;   // else do subtract 1
            }
            k--;
        }
        
        System.out.println(n);
        sc.close();
    }
}