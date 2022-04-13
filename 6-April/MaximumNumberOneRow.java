public class MaximumNumberOneRow {

    static int maxNoOne(int arr[][]){
        int max = -1;
        int result = 0;
        for(int i=0;i<arr.length; i++){
            int count = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
            if(max<count){
                max = count;
                result = i;
            }
           
        }
        return result;
    }

    public static void main(String args[]){
        int arr[][] = {
            {1,0,0,1,0},
            {1,1,0,0,0},
            {1,1,1,0,0},
            {1,1,1,0,0}
        };
        int row = maxNoOne(arr);
        System.out.println(row);

    }
    
}
