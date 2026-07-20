import java.util.Scanner;
 
public class Word {
    public static void main(String[] args) {
        // Fixed: Changed System.class to System.in
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        
        int lowercaseCount = 0;
        int uppercaseCount = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                lowercaseCount++;
            } else {
                uppercaseCount++;
            }
        }
        
        if (uppercaseCount > lowercaseCount) {
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
        
        scanner.close();
    }
}