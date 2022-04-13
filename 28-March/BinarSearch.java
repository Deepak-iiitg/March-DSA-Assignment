import java.util.*;

public class BinarSearch{
    static int binary(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }        
        int key = sc.nextInt();
        int result = binary(arr,key);
        System.out.println(result);
    }
}