public class AnonymusInnerClassLambda {
    public static void main(String[] args) {
//        Runnable r= () -> {
//            for (int i=0 ;i<10 ; i++){
//                System.out.println("From thread");
//            }
//        };


        Thread t = new Thread(()->{
            for (int i=0 ;i<10 ; i++){
                System.out.println("From thread");
            }});
        t.start();
        for (int i=0 ;i<10 ; i++){
            System.out.println("From main");
        }

    }
}
