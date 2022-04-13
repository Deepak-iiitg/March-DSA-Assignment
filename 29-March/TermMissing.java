public class TermMissing {

    static int binary(int arr[],int first,int cd,int start,int end){
        while(start<=end && start>=0){

            int mid = start+(end-end)/2;

            if(mid+1<=end && arr[mid]!=arr[mid+1]-cd){
                return arr[mid]+cd;
            }
            if(mid-1>=0 && arr[mid-1]+cd!=arr[mid]){
                return arr[mid-1]+cd;
            }

            int ap = first+cd*mid;

            if(ap<arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int arr[] = {2,6,8,10,12};
        int n = arr.length;
        int first = 2;
        int cd = 2;
        int term = binary(arr,first,cd,0,n-1);
        System.out.println(term);
    }
    
}
