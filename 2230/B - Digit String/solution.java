import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null) return;
        
        int t = Integer.parseInt(line.trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            String s = br.readLine();
            if (s == null) break;
            
            int n = s.length();
            int count13Remaining = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '1' || c == '3') {
                    count13Remaining++;
                }
            }
            
            int count2SoFar = 0;
            int maxLen = count2SoFar + count13Remaining;
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '2') {
                    count2SoFar++;
                } else if (c == '1' || c == '3') {
                    count13Remaining--;
                }
                
                int currentLen = count2SoFar + count13Remaining;
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
            }
            
            sb.append(n - maxLen).append("
");
        }
        System.out.print(sb);
    }
}