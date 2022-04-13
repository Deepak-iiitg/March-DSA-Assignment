public class SmallestMissingNumbar {

    static int binary(int arr[],int start,int end){
        // int arr[] = {0,1,2,3,4,5,6,7,9};
        while(start<=end){
           if(start>end){
               return start;
           }

           int mid = (start+end)/2;
           
           if(arr[mid] == mid){
              start = mid+1;
           }
           else{
               end = mid-1;
           }
        }

        return start;
    }

    public static void main(String args[]){
        int arr[] = {0,1,2,3,4,5,6,7,9};
        int n = arr.length;

        int missingNumber = binary(arr,0,n-1);

        System.out.println(missingNumber);
    }  
    
}
