public class NumberOfOneSortedArray {

    public static int findFirst(int arr[],int start,int end,int num){
        int index = -1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == num){
                
                index = mid;
                end = mid-1;
            }

            if(arr[mid]>=num){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return index;
    }

    public static int findLast(int arr[],int start,int end,int num){
        int index = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==num){
                index = mid;
                start = mid+1;
            }

            if(arr[mid]<=num){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return index;
    }

    public static void main(String args[]){
        int arr[] = {0,0,1,1,1};

        int num = 1;
        int first = findFirst(arr,0,arr.length-1,num);
        int last = findLast(arr,0,arr.length-1,num);

        if(first>=0 && last>=0){
            System.out.println("no. of 1's = "+(last-first+1));
        }
        else{
            System.out.println("no. of 1's = 0");
        }
    }
    
}
