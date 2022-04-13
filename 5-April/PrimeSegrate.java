public class PrimeSegrate {

    static boolean prime(int x){
        if(x == 1 || x ==0){
            return false;
        }
         boolean result = true;
         for(int i=2;i<x;i++){
             if(x%i ==0){
                 result = false;
                 return result;
             }
         }
         return result;
    }

    static void segrate(int arr[],int start,int end){
        while(start<end){
            if(prime(arr[start])){
                start++;
            }
            if(!prime(arr[end])){
                end--;
            }
            if(!prime(arr[start]) && prime(arr[end])){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

      public static void main(String args[]){
          int arr[] = {10,7,9,5,1,2,0,27,17,29,51,8,27};
          segrate(arr,0,arr.length-1);
          for(int i=0;i<arr.length;i++){
              System.out.print(arr[i]+" ");
          }
      }
    
}
