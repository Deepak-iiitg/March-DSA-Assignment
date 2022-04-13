import java.util.*;

public class CubeRootUsingBinary {

    static int binary(int num){
        int start = 0;
        int end = num;
        int ans=0;
        while(start<=end){
            int mid = (start+end)/2;

            if(mid*mid*mid == num){
                ans = mid;
                return mid;
            }
            else if(mid*mid*mid < num){
                ans = mid;
                start = mid+1;
            }
            else if(mid*mid*mid > num){
                ans = mid;
                end = mid-1;
            }

        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cube = binary(num);
        System.out.println(cube);
    }
    
}
