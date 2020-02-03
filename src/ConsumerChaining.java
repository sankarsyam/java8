import java.util.function.Consumer;

class NewMoovie{
    String name;
    String result;

    NewMoovie(String name,String result){
        this.name=name;
        this.result=result;
    }

    @Override
    public String toString() {
        return name+","+result;
    }
}
public class ConsumerChaining {

    public static void main(String[] args) {

        Consumer<NewMoovie> c1= m -> System.out.println("Moovie "+m.name+"is ready to release" );
        Consumer<NewMoovie> c2= m -> System.out.println("Moovie "+m.name+" is "+m.result);
        Consumer<NewMoovie> c3= m -> System.out.println("Moovie "+m.name+" is storing in DB ");

        Consumer<NewMoovie> chanedC = c1.andThen(c2).andThen(c3);
        NewMoovie newMoovie = new NewMoovie("GrandFather","Flop");
        chanedC.accept(newMoovie);
    }
}
