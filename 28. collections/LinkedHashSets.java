import java.util.*;

public class LinkedHashSets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(2);
        
        System.out.println(linkedHashSet);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(2);

        System.out.println(hashSet);

    }
}
