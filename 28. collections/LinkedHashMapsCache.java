import java.util.*;

public class LinkedHashMapsCache {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(5, 0.75f, true) {
            // method to be overriden to prevent size exceeding
            protected boolean removeEldestEntry(Map.Entry e) {
                return size() > 5;
            }
         };
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        linkedHashMap.put(5, "Five");
        linkedHashMap.put(4, "Four");

        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        linkedHashMap.put(10, "Ten");
        linkedHashMap.put(9, "Nine");
        
        System.out.println("After adding 10 and 9: " + linkedHashMap);


        linkedHashMap.get(5);
        System.out.println("After accessing 5: " + linkedHashMap);
    }
}
