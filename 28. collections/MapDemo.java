import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(2, "Two");
        map.put(4, "Four");

        map.put(2, "UTwo");
        map.put(10, "Ten");

        System.out.println(map);

        System.out.println(map.get(3));
        System.out.println(map.ceilingEntry(5));
    }    
}
