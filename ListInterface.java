import java.util.*;
import java.util.stream.*;

public class ListInterface {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<Integer>();

        l1.add(0,0);
        l1.add(1,100);
        l1.add(2,1);

        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>();

        l2.addAll(0,l1);

        System.out.println(l2);

        l1.remove(Integer.valueOf(0));

        System.out.println(l1);

        System.out.println(l2.get(1));

        l1.set(1,100);
        System.out.println(l1);

        int [] arr = {1,2,3,4,5};
        List<Integer> l3 = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(l3);
    }
}
