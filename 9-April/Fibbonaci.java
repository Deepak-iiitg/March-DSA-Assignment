public class Fibbonaci {
    static int fibbo(int n){
        if(n==0){
           
            return 0;
        }
        if(n==1){
           
            return 1;
        }
        
        return fibbo(n-1)+fibbo(n-2);

        
    }
    public static void main(String args[]){
        int n  = 5;
        for(int i=0;i<=5;i++){
            System.out.print(fibbo(i)+" ");
        }
        
    }
    
}
