import java.util.*;
public class CopyListToAnotherList {

    public static void main(String args[]){
        List<Integer> originalList = Arrays.asList(10,2,0,19,20);

        List<Integer> copyList = new ArrayList<>(originalList);
        System.out.println(copyList);
    }
    
}
