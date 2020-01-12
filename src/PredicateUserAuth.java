import java.util.Scanner;
import java.util.function.Predicate;

class User {
    String userName;
    String password;
    User(String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}
public class PredicateUserAuth {
    public static void main(String[] args) {
        Predicate<User>  p = user -> user.userName.equals("syam") && user.password.equals("java");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter User name");
        String userName= sc.next();
        System.out.println("Enter password");
        String password= sc.next();
        User newUser = new User(userName,password);
        if(p.test(newUser) ) {
            System.out.println("Valid user");
        }else {
            System.out.println("Invalid user login again");
        }
    }
}
