public class ZeroOneTwoSort {

    static void sort(int arr[],int start,int end){
     
        int mid = 0;
  
        int temp = 0;
        while(mid<=end){

            if(arr[mid] ==3){

                temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                start++;
                mid++;
            }
            else if(arr[mid] ==4){
                mid++;
            }

            else if(arr[mid] == 5){
                temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }

        }
       
    }

    public static void main(String args[]){
        int arr[] = {5,3};
        int n = arr.length;
        sort(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
