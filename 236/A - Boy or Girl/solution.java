import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
 
        HashSet<Character> st = new HashSet<>();
 
        for (int i = 0; i < s.length(); i++) {
            st.add(s.charAt(i));
        }
 
        if (st.size() % 2 == 0) {
            System.out.print("CHAT WITH HER!");
        } else {
            System.out.print("IGNORE HIM!");
        }
        
        sc.close();
    }
}