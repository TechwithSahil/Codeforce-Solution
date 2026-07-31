import java.util.Scanner;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int count0 = 0;
            int count1 = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            
            if (count1 % 2 == 0) {
                System.out.println(count1);
                ArrayList<Integer> indices = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        indices.add(i + 1);
                    }
                }
                for (int i = 0; i < indices.size(); i++) {
                    System.out.print(indices.get(i) + (i == indices.size() - 1 ? "" : " "));
                }
                System.out.println();
            } else if (count0 % 2 != 0) {
                System.out.println(count0);
                ArrayList<Integer> indices = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        indices.add(i + 1);
                    }
                }
                for (int i = 0; i < indices.size(); i++) {
                    System.out.print(indices.get(i) + (i == indices.size() - 1 ? "" : " "));
                }
                System.out.println();
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }
}