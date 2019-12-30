import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortNoLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(1);
        list.add(3);
        list.add(20);
        System.out.println("Before sort"+ list);
        // sorting
        Collections.sort(list);
        System.out.println("Default sort"+ list);
        //customised sorting
        Collections.sort(list,new MyComparator());
        System.out.println("After sort"+ list);
    }
}
