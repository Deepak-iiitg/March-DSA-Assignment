public class BooleanMatrix {

    public static void main(String args[]){
        /*
        1 0 0 1
0 0 1 0
0 0 0 0
        */
        int mat[][] = {{1,0,0,1},{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,1}};
        int temp[][] = new int[5][4];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1){
                    for(int k=0;k<mat[i].length;k++){
                        temp[i][k] = 1;
                    }
                    for(int k=0;k<mat.length;k++){
                        temp[k][j] = 1;
                    }
                   //break;
                }
               
            }
            
        }
        for(int i=0;i<temp.length;i++){
            for(int j=0;j<temp[i].length;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
