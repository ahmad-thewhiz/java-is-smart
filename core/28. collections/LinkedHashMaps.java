import java.util.*;

public class LinkedHashMaps {
    public static void main(String[] args) {
        // default loading factor is 0.75 and default initial capacity is 16
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");

        System.out.println(linkedHashMap);

        // access order - it is used to maintain the order of the elements based on the access (LRU)
        linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put(1, "One");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(2, "Two");

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(3));

        
        
        
    }
}
