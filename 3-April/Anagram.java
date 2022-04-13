import java.util.*;
public class Anagram {
        public static boolean isAnagram(String s, String t) {
            
            char[] s1 = s.toCharArray();
            char[] t1 = t.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(t1);
            boolean ans = true;
            int i=0,j=0;
            while(i<s1.length && j<t1.length){
                if(s1.length != t1.length){
                    return false;
                }
                if(s1[i]!=t1[j]){
                    return false;
                }
                else{
                    i++;
                    j++;
                }
            }
            
            return true;
        }    

        public static void main(String args[]){
            String s = "rat";
            String t = "car";
            System.out.println(isAnagram(s,t));
        }
}
    

