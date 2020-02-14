import java.util.function.Function;

public class FunctionSampleRemoveSpace {

    public static void main(String[] args) {
        String s= "Syam Sankar";
        Function<String,String > fun = s1 -> s1.replaceAll(" ","");
        System.out.println("Replace blank space - Syam Sankar :"+fun.apply(s));


        Function<String,Integer > func = s1 -> s1.length()-s1.replaceAll(" ","").length();
        System.out.println("Count blank space - Syam Sankar :"+func.apply(s));
    }
}
