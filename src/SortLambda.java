import java.util.ArrayList;
import java.util.Collections;

public class SortLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(3);
        list.add(20);
        System.out.println("Before sort"+ list);
        // Implementation class for comparator is not required
        Collections.sort(list,(o1, o2) -> (o1 >o2) ? -1:(o1 <o2) ?1 :0 );
        System.out.println("After sort"+ list);
    }
}
