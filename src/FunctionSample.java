import java.util.function.Function;

public class FunctionSample {

    public static void main(String[] args) {
        Function<String,Integer> fun = s -> s.length();
        System.out.println("Length of string - Syam Sankar "+fun.apply("Syam Sankar"));

        Function<Integer,Integer> square = num -> num*num;
        System.out.println("Square of 22 :" + square.apply(22));
    }
}
