public class Example5LambdaThred {
    public static void main(String[] args) {
        Runnable demo = () -> {
            for (int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };
        Thread t= new Thread(demo);
        t.start();
        for (int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
