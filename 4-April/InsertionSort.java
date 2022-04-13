public class InsertionSort {

    static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {10,9,28,0,1,28,19,8,1,2,3,0};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
