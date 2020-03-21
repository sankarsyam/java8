interface  SampleInterface {
    public void  m1();
}

public class DoubleColonOperatorMethodReference {

    public static void m2()
    {
        System.out.println("Method Reference");
    }

    public void m3(){
        for (int i=0;i<3;i++){
            System.out.println("From child thread");
        }
    }
    public static void main(String[] args) {
        //method reference for static method
         SampleInterface si = DoubleColonOperatorMethodReference::m2;
         si.m1();

         DoubleColonOperatorMethodReference doubleColonOperatorMethodReference = new DoubleColonOperatorMethodReference();
        //method reference for instance method
         Runnable runnable = doubleColonOperatorMethodReference::m3;
         Thread t = new Thread(runnable);
         t.start();
        for (int i=0;i<3;i++){
            System.out.println("From Main thread");
        }
    }
}
