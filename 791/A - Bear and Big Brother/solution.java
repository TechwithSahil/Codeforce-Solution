import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        
        // Loop runs indefinitely until the condition inside breaks it
        for (int years = 1; ; years++) {
            limak *= 3; // Limak's weight triples
            bob *= 2;   // Bob's weight doubles
            
            if (limak > bob) { 
                System.out.println(years);
                break;
            }
        }
        sc.close();
    }
}