import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);

        // to get even numbers
        List<Integer> l1 = l.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
        System.out.println(l1);

        // multiple each element with 2
        List<Integer> l2 = l.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(l2);
    }
}
