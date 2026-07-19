import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        // Capitalize the first character and append the rest of the string
        String result = Character.toUpperCase(s.charAt(0)) + s.substring(1);
        
        System.out.println(result);
        sc.close();
    }
}