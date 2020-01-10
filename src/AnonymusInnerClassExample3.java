  interface  Sample{
    public void m1();
}

public class AnonymusInnerClassExample3 {
    int x= 223; // instance variable of x

    public  void m2(){

        Sample s= new Sample() {
            int x= 332; // instance variable of s
            @Override
            public void m1() {
                System.out.println(">>>>>>>>>>>>>>>> "+this.x); // this refers current innerclass object
            }
        };
        s.m1();
    }
    public static void main(String[] args) {

        AnonymusInnerClassExample3 a3 = new AnonymusInnerClassExample3();
        a3.m2();

    }
}
