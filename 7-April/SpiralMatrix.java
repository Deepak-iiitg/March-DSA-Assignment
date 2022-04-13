import java.util.Scanner;
public class SpiralMatrix {

    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        int m = 4;
        int n = 4;
        int matrix[][] = new int[m][n];
        int k=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                 matrix[i][j] = k++;
            }
        }

        int row_start = 0,row_end = m-1,col_start = 0,col_end = n-1;
        while(row_start<=row_end && col_start<=col_end){
             for(int j=col_start;j<=col_end;j++){
                 System.out.print(matrix[row_start][j]+" ");
             }
             row_start++;
             for(int i=row_start;i<=row_end;i++){
                System.out.print(matrix[i][col_end]+" ");
             }
             col_end--;
             for(int j=col_end;j>=col_start;j--){
                System.out.print(matrix[row_end][j]+" ");
             }
             row_end--;
             for(int i=row_end;i>=row_start;i--){
                System.out.print(matrix[i][col_start]+" ");
             }
             col_start++;
        }
    }
    
}
