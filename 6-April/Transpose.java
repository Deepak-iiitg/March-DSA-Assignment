public class Transpose {

    public static void main(String args[]){
        int arr[][] = {
            {2,3,4},
            {5,6,7}
        
        };
        int b[][] = new int[3][2];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
               b[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
