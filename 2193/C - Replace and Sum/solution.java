import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            
            long[] a = new long[n + 1];
            long[] b = new long[n + 1];
            
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong();
            }
            
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextLong();
            }
            
            long[] M = new long[n + 2];
            for (int i = n; i >= 1; i--) {
                M[i] = Math.max(a[i], b[i]);
                if (M[i + 1] > M[i]) {
                    M[i] = M[i + 1];
                }
            }
            
            long[] P = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                P[i] = P[i - 1] + M[i];
            }
            
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                System.out.print((P[r] - P[l - 1]) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}