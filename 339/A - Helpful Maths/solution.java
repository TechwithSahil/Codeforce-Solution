import java.util.Scanner;
import java.util.Arrays;
 
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String s = scanner.next();
        
        // Split the string by the '+' symbol
        // Note: '+' is a special character in regex, so we escape it with \\
        String[] numbers = s.split("\\+");
        
        
        Arrays.sort(numbers);
        
        // Join the sorted array back together with '+' delimiters
        String result = String.join("+", numbers);
        
        // Output the final formatted string
        System.out.println(result);
        
        scanner.close();
    }
}