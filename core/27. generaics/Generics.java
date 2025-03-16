import java.util.ArrayList;
import java.util.List;

public class Generics<T> {
    List<T> data = new ArrayList<>();

    public static void main(String[] args) {
        Generics<String> gd = new Generics<>();

        gd.data.add("Hello");
        gd.data.add("World");
        gd.data.add("Java");

        String str = gd.data.get(0);
        System.out.println(str);
    }
}
