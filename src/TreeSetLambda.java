import java.util.TreeSet;

public class TreeSetLambda {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>(((o1, o2) -> (o1 > 02)? -1 : (01<02)?1:0));
        ts.add(67);
        ts.add(6);
        ts.add(7);
        ts.add(4);
        System.out.println(ts);
        
    }
}
