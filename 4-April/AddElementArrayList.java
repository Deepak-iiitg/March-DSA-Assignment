import java.util.*;

public class AddElementArrayList {

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.set(3,10);
        System.out.println(arr);
    }
    
}
