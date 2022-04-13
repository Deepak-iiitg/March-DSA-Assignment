public class OddUsingRecursion {

    static void display(int n,int i){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        display(n,i+2);
    }

    public static void main(String args[]){
        int n = 31;
        display(n,1);
    }
}
