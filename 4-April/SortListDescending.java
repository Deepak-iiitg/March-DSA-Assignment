import java.util.*;
public class SortListDescending {

    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(10);
        list.add(4);
        list.add(50);
        list.add(3);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
       
        System.out.println(list);
    }
    
}
