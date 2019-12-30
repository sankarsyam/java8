import java.util.TreeMap;

public class TreeMapLambda {
    public static void main(String[] args) {
        TreeMap<Integer,String>  tm = new TreeMap<>((o1, o2) -> (o1>o2 )? -1:(o1<o2)?1:0);
        tm.put(100,"syam");
        tm.put(300,"Bigger");
        tm.put(20,"smaller");
        tm.put(50,"ss");
        System.out.println(tm);
    }
}
