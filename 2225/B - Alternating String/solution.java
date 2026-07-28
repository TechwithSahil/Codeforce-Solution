import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) return;
        
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            if (canBecomeAlternating(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
 
    private static boolean canBecomeAlternating(String s) {
        int n = s.length();
        if (n <= 1) return true;
 
        // Count how many adjacent pairs break the alternating property
        int violations = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                violations++;
            }
        }
 
        // If there are 0 violations, it's already alternating.
        // If there are 1 or 2 violations, we can always choose a substring 
        // to reverse/invert and fix the boundaries.
        // If there are more than 2 violations, one operation is not enough.
        return violations <= 2;
    }
}