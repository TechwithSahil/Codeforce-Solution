import java.io.*;
import java.util.*;
 
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
            int k = Integer.parseInt(st.nextToken());
            
            int[] a = new int[k + 2];
            if (st.hasMoreTokens()) {
                for (int i = 1; i <= k; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                }
            } else {
                st = new StringTokenizer(br.readLine());
                for (int i = 1; i <= k; i++) {
                    a[i] = Integer.parseInt(st.nextToken());
                }
            }
            a[k + 1] = Integer.MAX_VALUE; // level k+1 has no capacity limit
            
            int[] b = new int[n + 1];
            int[] count = new int[k + 2];
            
            if (st.hasMoreTokens()) {
                for (int i = 1; i <= n; i++) {
                    b[i] = Integer.parseInt(st.nextToken());
                    count[b[i]]++;
                }
            } else {
                st = new StringTokenizer(br.readLine());
                for (int i = 1; i <= n; i++) {
                    b[i] = Integer.parseInt(st.nextToken());
                    count[b[i]]++;
                }
            }
            
            List<Integer> operations = new ArrayList<>();
            boolean possible = true;
            
            // Process from level k down to 1
            for (int i = k; i >= 1; i--) {
                // Find all courses currently at level i
                List<Integer> coursesAtLevelI = new ArrayList<>();
                for (int c = 1; c <= n; c++) {
                    if (b[c] == i) {
                        coursesAtLevelI.add(c);
                    }
                }
                
                // We need to move every course at level i to level k+1 eventually
                for (int course : coursesAtLevelI) {
                    // Move this course step-by-step from its current level up to k+1
                    while (b[course] < k + 1) {
                        int curLevel = b[course];
                        int nextLevel = curLevel + 1;
                        
                        // If the next level is already full, we must free up space first
                        if (count[nextLevel] >= a[nextLevel]) {
                            // Find another course at nextLevel to bump up
                            int bumpCourse = -1;
                            for (int c = 1; c <= n; c++) {
                                if (b[c] == nextLevel && c != course) {
                                    bumpCourse = c;
                                    break;
                                }
                            }
                            
                            if (bumpCourse == -1) {
                                possible = false;
                                break;
                            }
                            
                            // Cascade the bump operation
                            operations.add(bumpCourse);
                            count[nextLevel]--;
                            b[bumpCourse]++;
                            count[b[bumpCourse]]++;
                        }
                        
                        // Move our primary target course to the next level
                        operations.add(course);
                        count[curLevel]--;
                        b[course]++;
                        count[nextLevel]++;
                        
                        if (operations.size() > 1000) {
                            possible = false;
                            break;
                        }
                    }
                    if (!possible) break;
                }
                if (!possible) break;
            }
            
            if (!possible || operations.size() > 1000) {
                sb.append("-1
");
            } else {
                sb.append(operations.size()).append("
");
                for (int i = 0; i < operations.size(); i++) {
                    sb.append(operations.get(i));
                    if (i < operations.size() - 1) {
                        sb.append(" ");
                    }
                }
                sb.append("
");
            }
        }
        System.out.print(sb);
    }
}