import java.util.*;
public class Majority {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0,max = 1,ans = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
                if(max<count){
                    max = count;
                    ans = nums[i];
                }
            }
            else{
                count = 1;
            }
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {3,2,3};
        System.out.println(majorityElement(nums));
    }
}