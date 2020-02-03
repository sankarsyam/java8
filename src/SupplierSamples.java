import java.util.Date;
import java.util.function.Supplier;

public class SupplierSamples {
    public static void main(String[] args) {
        //return date
        System.out.println(" ******************> Date  supplier");
        Supplier<Date>  supplyDate= () ->  new Date();
        System.out.println(supplyDate.get());

        //To return random name
        System.out.println("******************> Name supplier");
        Supplier<String> nameSupplier = () -> {
            String[] names = {"Syam","Manu","Saji","Appu"};
            int x= (int) (Math.random()*4);// 0 -3
            return names[x];
        };

        System.out.println(nameSupplier.get());
        System.out.println(nameSupplier.get());
        System.out.println(nameSupplier.get());

        System.out.println("******************> OTP(6 digit) supplier ");
        Supplier<String> otpSupply = () -> {
            String otp ="";
            for (int i=0;i<6;i++){
                otp= otp+(int)(Math.random()*10); // random digit from 0-9 is added to the otp
            }
            return otp;
        };
        System.out.println(otpSupply.get());
        System.out.println(otpSupply.get());
        System.out.println(otpSupply.get());

        System.out.println("******************> Random password supplier ");
        // length 8 char - 2,4,6 and 8 th places can only digits - 1,3,5,7 the places uppercase alphabets with &,$,@
        System.out.println("length 8 char - 2,4,6 and 8 th places can only digits - 1,3,5,7 the places uppercase alphabets with &,$,@");
        Supplier<Integer>  d = () -> (int)(Math.random()*10);
        String symbols = "ABCDEFGHIJKLMNOPQRS@#$"; // 0-28
        Supplier<Character> c =() -> symbols.charAt((int)Math.random()*29);
        Supplier<String> pwsSupplier  = () -> {
            String pwd = "";
            for (int i=1; i<8 ; i++ ){
                if(i%2 ==0){
                    pwd = pwd+ d.get();
                }else{
                    pwd = pwd+ c.get();
                }
            }
            return pwd;
        };
        System.out.println(pwsSupplier.get());
        System.out.println(pwsSupplier.get());
        System.out.println(pwsSupplier.get());
    }
}
