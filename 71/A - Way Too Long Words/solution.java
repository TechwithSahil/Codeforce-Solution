import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while (n-- > 0) {
            String s = sc.next();
            int len = s.length();
            
            if (len > 10) {
                System.out.printf("%c%d%c
", s.charAt(0), len - 2, s.charAt(len - 1));
            } else {
                System.out.println(s);
            }
        }
    }
}