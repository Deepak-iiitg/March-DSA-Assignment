public class Palindrome {

    static boolean check(String str) {
        boolean result = true;
        int l = 0;
        int h = (str.length())-1;
        //System.out.println(h);
        while(l<h){

            if(str.charAt(l) == str.charAt(h)){
                l++;
                h--;
            }
            else{
                return false;
            }

        }
        return result;
    }
    public static void main(String args[]){
        String str = "deepak";
        boolean result = check(str);
        if(result){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("not Palindrome");
        }
    }
    
}
