import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
//        if(o1>o2){
//            return -1;
//        }
//        else if(o1 < o2){
//            return 1;
//        }
//        return 0;
        return (o1 > o2) ? -1 :(o1<02) ? 1 :0;
    }
}
