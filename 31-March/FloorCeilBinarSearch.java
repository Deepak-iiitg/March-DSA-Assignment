public class FloorCeilBinarSearch {

    static int ceilFind(int arr[],int num){

        int ans = -1;
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == num){
                return num;
            }

            if(arr[mid]>num){
                 ans = arr[mid];
                 end = mid-1;
            }
            else{
                start = mid+1;
            }

        }

        return ans;
        
    }

    static int floorFind(int arr[],int num){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == num){
                return num;
            }

            else if(arr[mid] < num){
                ans = arr[mid];                
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        return ans;

    }
    
    public static void main(String args[]){
        int arr[] = {1,3,5,7,8,9,13,18};

        int value = 12;

        int floor = floorFind(arr,value);
        int ceil = ceilFind(arr,value);

        System.out.println("floor value = "+floor);
        System.out.println("ceil value = "+ceil);
    }
    
}
