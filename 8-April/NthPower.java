public class NthPower {

    static int power(int n,int k){
        if(k==0){
            return 1;
        }
        return n*power(n,k-1);
    }
    public static void main(String args[]){
        int k=2,n=8;
        System.out.println(power(k,n));
    }
    
}
