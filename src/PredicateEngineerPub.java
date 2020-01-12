import java.util.function.Predicate;

class SoftwareEngineer{
    String name;
    int age;
    boolean isHavingGirlFriend;
    SoftwareEngineer(String name, int age, boolean isHavingGirlFriend){
        this.name = name;
        this.age = age;
        this.isHavingGirlFriend = isHavingGirlFriend;
    }

    public String  toString(){
        return  name;
    }
}
public class PredicateEngineerPub {
    public static void main(String[] args) {
        SoftwareEngineer[] SE = {
                new SoftwareEngineer("Syam",32,false),
                new SoftwareEngineer("Ravi",17,true),
                new SoftwareEngineer("Kutti",32,true),
                new SoftwareEngineer("Mon",32,true),
        };

        Predicate<SoftwareEngineer> allowed = softwareEngineer ->  softwareEngineer.age > 18 && softwareEngineer.isHavingGirlFriend;
        System.out.println("Allowed members in the pub");
        for (SoftwareEngineer engineer:SE){
            if(allowed.test(engineer)){
                System.out.println(engineer);
            }
        }
    }
}
