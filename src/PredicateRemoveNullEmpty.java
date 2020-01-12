import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateRemoveNullEmpty {
    public static void main(String[] args) {
        String[] names= {"Syam","Sankar","",null,"Bhagat",null};
        Predicate<String> notNullAndEmpty = s -> s != null  &&  s.length() != 0;
        ArrayList<String> l = new ArrayList<String>();
        for(String name : names) {
            if(notNullAndEmpty.test(name)){
                l.add(name);
            }
        }
        System.out.println( "Refined List:" + l);
    }
}
