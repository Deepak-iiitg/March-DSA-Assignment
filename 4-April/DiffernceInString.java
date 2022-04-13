import java.util.*;

class DiffernceInString {
    public static char findTheDifference(String s, String t) {
        
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        int i=0,j=0;
        while(i<s1.length && j<t1.length){
            if(s1[i] != t1[j]){
                return t1[j];
            }
            else{
                i++;
                j++;
            }
        }
        
        return t1[t1.length-1];
    }
    public static void main(String args[]){
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}