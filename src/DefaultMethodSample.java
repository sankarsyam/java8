interface  DefaultSample{
    default void m1(){
        System.out.println("From interface");
    }
}

class DefaultMethod implements DefaultSample{

}
public class DefaultMethodSample implements  DefaultSample{

    @Override
    public void m1() {
        System.out.println("My implementation");
    }

    public static void main(String[] args) {

        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.m1();
        DefaultMethodSample ds = new DefaultMethodSample();
        ds.m1();
    }
}
