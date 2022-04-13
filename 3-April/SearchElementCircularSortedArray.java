public class SearchElementCircularSortedArray {

    static int binary(int arr[],int key){

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]<=arr[end]){
                  if(key>=arr[mid] && key<=arr[end]){
                      start = mid+1;
                  }
                  else{
                      end = mid-1;
                  }
            }
            else{
                if(key>=arr[start] && key<=arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

           
        }
        return -1;

    }

    public static void main(String args[]){
        int arr[] = {8,9,10,2,3,6};
        int key = 2;
        int index = binary(arr,key);
        System.out.println(index);
    }
    
}
