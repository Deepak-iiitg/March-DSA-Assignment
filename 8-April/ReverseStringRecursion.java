public class ReverseStringRecursion {
    static String reverse(String str,int i,String rev){
        if(i==0){
            rev = rev+str.charAt(i);
            return rev;
        }
        //rev = rev+reverse(str,i-1,rev);
        //rev = rev+str.charAt(i)+reverse(str,i-1,rev);
        return str.charAt(i)+reverse(str,i-1,rev);
    }

    public static void main(String args[]){
        String str = "deepak";
        String result = reverse(str,str.length()-1,"");
        System.out.println(result);
    }
    
}
