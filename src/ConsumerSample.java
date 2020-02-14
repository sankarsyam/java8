import java.util.ArrayList;
import java.util.function.Consumer;

class Moovie{
    String name;
    String hero;
    String director;
    Moovie(String name,String hero,String director){
        this.name=name;
        this.hero=hero;
        this.director = director;
    }

    @Override
    public String toString() {
        return name+","+hero+","+director;
    }
}
public class ConsumerSample {
    public static void populate(ArrayList<Moovie> list){
        list.add(new Moovie("Ravanaprabhu","lalattan","renjith"));
        list.add(new Moovie("Aramthamburan","lalattan","renjith"));
        list.add(new Moovie("Narasinham","lalattan","renjith"));
    }

    public static void main(String[] args) {
        ArrayList<Moovie> moovies = new ArrayList<Moovie>();
        populate(moovies);

        Consumer<Moovie> c = m ->{
            System.out.println(m);
        };

        for (Moovie m: moovies){
            c.accept(m);
        }
    }
}
