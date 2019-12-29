public class WithAndWithOut {
    public static void main(String args[]){
        WithOutLambdaInterface wo = new WithOutLambdaClass();
        wo.m1();
        WithOutLambdaInterface wi= () -> System.out.println("From lambda expression");
        wi.m1();
    }
}
