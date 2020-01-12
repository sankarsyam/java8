import java.util.function.Predicate;
// To display name starts with K
public class PredicateNameSample {


    public static void main(String[] args) {
        String[] names= {"Sunny","Kajal","Kathrina","Mallika"};
        Predicate<String> startsWithK = s -> s.charAt(0) =='K';
        System.out.println("Names start with K:");
        for(String name:names){
            if(startsWithK.test(name)){
                System.out.println(name);
            }
        }

    }
}
