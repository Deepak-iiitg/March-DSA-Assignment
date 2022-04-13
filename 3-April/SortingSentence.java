import java.util.*;
public class SortingSentence {

        public static String sortSentence(String s) {
            
            String ans = "";
            String arr[] = s.split(" ");
            String result[] = new String[arr.length];
            for(int i=0;i<arr.length;i++){
                int t = Character.getNumericValue(arr[i].charAt(arr[i].length()-1));
                result[t-1] = arr[i].substring(0,arr[i].length()-1);
            }
            
            ans = String.join(" ",result);
            return ans;
          
        }

    public static void main(String args[]){
        String s = "is2 This1 my3 home4";
        System.out.println(sortSentence(s));
      
    }
    
}
