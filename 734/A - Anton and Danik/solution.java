import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // number of games
        String s = sc.next(); // string like "ADDAAD"
        
        int anton = 0;
        int danik = 0;
        
        // Logic: check each game result
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == 'A') {
                anton++;  // Anton won this game
            } else {
                danik++;  // Danik won this game
            }
        }
        
        // Decide the winner
        if(anton > danik) {
            System.out.println("Anton");
        } else if(danik > anton) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
        
        sc.close();
    }
}