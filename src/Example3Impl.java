public class Example3Impl {

    public static void main(String[] args) {
//        Example3 e3 = (s) -> System.out.println("Length is "+s.length());
//        e3.getLength("Hello");
//        e3.getLength("With lambda");
        Example3 e3 = s -> s.length();
        System.out.println("Lenth "+e3.getLength("Hello"));
    }
}
