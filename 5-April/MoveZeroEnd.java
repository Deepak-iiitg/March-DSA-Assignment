public class MoveZeroEnd {

    static void sort(int arr[],int start,int end){
        while(start<end){
            if(arr[start] ==1 && arr[end]!=1){
                 int temp = arr[start];
                 arr[start] = arr[end];
                 arr[end] = temp;
                 start++;
                 end--;
            }
            if(arr[end] == 1){
                end--;
            }
            if(arr[start] == 0){
                start++;
            }

        }
    }
   /* static void sort(int arr[],int n){
        int zero_count = 0;
        int one_count = 0;
        for(int i=0;i<=n;i++){
            if(arr[i] ==0){
                zero_count++;
            }
            else{
                one_count++;
            }
        }
        int k = 0;
        int i=0;
        while(i<one_count){
            arr[i] = 1;
            i++;
            k = i;
        }
        for(int j=0;j<zero_count;j++){
            arr[k++] = 0;
        }
    }*/
    public static void main(String args[]){
        int arr[] = {0,0,0,1,1,1,0,0,1,1,0,0,1,1,0,0};
        int n = arr.length;
        sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
