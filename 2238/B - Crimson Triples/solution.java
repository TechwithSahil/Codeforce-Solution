import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            int n = Integer.parseInt(st.nextToken());
            
            long totalTriples = 0;
            for (int b = 1; b <= n; b++) {
                long choices = n / b;
                totalTriples += choices * choices;
            }
            sb.append(totalTriples).append("
");
        }
        System.out.print(sb);
    }
}