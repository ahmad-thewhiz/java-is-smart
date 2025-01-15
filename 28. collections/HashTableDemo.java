import java.util.*;

public class HashTableDemo {
    public static void main(String[] args) {
        // difference between HashMap and HashTable is that HashTable is synchronized which means it is thread safe

        Hashtable ht=new Hashtable<>();

        ht.put(1, "A");
        ht.put(3, "C");
        ht.put(2, "B");

        System.out.println(ht); // {3=C, 2=B, 1=A}

        String s=(String)ht.get(2);
        System.out.println(s); // B

        Enumeration e=ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        ht.compute(2, (k,v)->v+"Z");

        ht.computeIfAbsent(7, (k)->"Z"+k);

        System.out.println(ht);
        
    }
}
