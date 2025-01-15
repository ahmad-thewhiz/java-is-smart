import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        
        // sorted order
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(10,20,30,40));
        treeSet.add(1);
        treeSet.add(11);
        treeSet.add(5);
        treeSet.add(55);
        treeSet.add(3);
        treeSet.add(33);

        System.out.println(treeSet);

        // ceiling
        System.out.println(treeSet.ceiling(15));

        // floor
        System.out.println(treeSet.floor(15));

        // higher
        System.out.println(treeSet.higher(15));

        // lower
        System.out.println(treeSet.lower(15));

        // pollFirst
        System.out.println(treeSet.pollFirst());

        // pollLast
        System.out.println(treeSet.pollLast());

        // descendingSet
        System.out.println(treeSet.descendingSet());

        // headSet
        System.out.println(treeSet.headSet(15));

        // tailSet
        System.out.println(treeSet.tailSet(15));

        // subSet
        System.out.println(treeSet.subSet(5, 15));

        // find
        System.out.println(treeSet.contains(5));

        // remove
        treeSet.remove(5);

    }
}
