import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next(); // original word
        String t = sc.next(); // word to check if it's a translation
        
        boolean isTranslation = true;
        int n = s.length();
        
        // If lengths are different, it can't be a translation
        if(s.length() != t.length()) {
            isTranslation = false;
        } else {
            // Compare s's first char with t's last char, s's second with t's second last, and so on
            for(int i = 0; i < n; i++) {
                if(s.charAt(i) != t.charAt(n - 1 - i)) {
                    isTranslation = false;
                    break; // No need to check further
                }
            }
        }
        
        if(isTranslation) System.out.println("YES");
        else System.out.println("NO");
        
        sc.close();
    }
}