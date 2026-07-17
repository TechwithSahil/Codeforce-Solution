import java.util.Scanner;
 
public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int moves = 0;
        int target = 2; // 0-indexed center
 
        // input
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
 
        // jab tak 1 center me nahi aata
        while(arr[target][target]!= 1){
            // 1 ki position find karo
            int r = 0, c = 0;
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(arr[i][j] == 1){
                        r = i;
                        c = j;
                    }
                }
            }
 
            // row ko center ki taraf lao
            if(r < target){
                swapRow(arr, r, r+1);
                moves++;
            }
            else if(r > target){
                swapRow(arr, r, r-1);
                moves++;
            }
 
            // column ko center ki taraf lao
            if(c < target){
                swapCol(arr, c, c+1);
                moves++;
            }
            else if(c > target){
                swapCol(arr, c, c-1);
                moves++;
            }
        }
 
        System.out.println(moves);
        sc.close();
    }
 
    // row swap karne ka function
    static void swapRow(int[][] arr, int r1, int r2){
        for(int j = 0; j < 5; j++){
            int temp = arr[r1][j];
            arr[r1][j] = arr[r2][j];
            arr[r2][j] = temp;
        }
    }
 
    // column swap karne ka function
    static void swapCol(int[][] arr, int c1, int c2){
        for(int i = 0; i < 5; i++){
            int temp = arr[i][c1];
            arr[i][c1] = arr[i][c2];
            arr[i][c2] = temp;
        }
    }
}