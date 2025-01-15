import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // order is not maintained
        HashSet<Integer> hs = new HashSet<Integer>(20, 0.5f);

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(3);

        System.out.println(hs);

        // find element
        System.out.println(hs.contains(3));

        // remove element
        hs.remove(3);
        System.out.println(hs);

        // size of hashset
        System.out.println(hs.size());

        // clear hashset
        hs.clear();
    }
}
