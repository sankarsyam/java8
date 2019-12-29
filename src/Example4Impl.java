public class Example4Impl {
    public static void main(String[] args) {
        Example4 e4 = (a) -> a*a;
        System.out.println(" Square of 4 ="+ e4.squareIt(4));
        System.out.println(" Square of 4444 =" +e4.squareIt(4444));
    }
}
