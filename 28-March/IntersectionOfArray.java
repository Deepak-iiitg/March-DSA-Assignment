import java.util.*;
public class IntersectionOfArray {
    static boolean binary(int arr[],int key){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr1[] = {3,6,8};
        int arr2[] = {1,2,3,5,6,90,789};
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++){
            int key = arr1[i];
            if(binary(arr2,key)){
                intersection.add(key);
            }
        }

        for(int i=0;i<intersection.size()-1;i++){
            if(intersection.get(i+1) == intersection.get(i)){
                intersection.remove(i);
                i = i-1;
            }
        }

        for(int i=0;i<intersection.size();i++){
            System.out.print(intersection.get(i)+" ");
        }
    }
    
}
