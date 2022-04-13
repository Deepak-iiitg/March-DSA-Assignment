public class TwoSum {
	static int[] twoSum(int arr[],int start,int end,int k){

        int result[] = {-1,-1};

		while (start<end) {
			if (arr[start] + arr[end] == k){
                result[0] = start;
                result[1] = end;
				return result;
            }
			else if (arr[start] + arr[end] < k){
				start++;
            }
			else 
				end--;
		}
		return result;
	}	
    public static void main(String args[]){

        int arr[] = {1,3,6,9,10,20,62};
        int k = 80;
        int result[] = twoSum(arr,0,arr.length-1,k);
        System.out.println(result[0]+" "+result[1]);
    }
    
}
