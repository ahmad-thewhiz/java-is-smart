import java.util.ArrayList;
import java.util.Comparator;

public class a_list {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<Integer>();
        // Integer is the wrapper class of int. it is the reference type of int
        
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.remove(2);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.remove(Integer.valueOf(50));
        numbers.add(2, 5);
        numbers.add(3, 3);
        
        System.out.println("Size of ArrayList: "+ numbers.size());
        System.out.println(numbers.toString());
        System.out.println("Element at index 1: "+ numbers.get(1));
        System.out.println("Index of 20: "+ numbers.indexOf(20));

        numbers.set(2, Integer.valueOf(70));
        System.out.println(numbers.toString());

        numbers.sort(Comparator.naturalOrder());
        // numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        numbers.forEach(number->{
            numbers.set(numbers.indexOf(number), number*2);
        });

        System.out.println(numbers.toString());

        Integer[] integerArray = numbers.toArray(new Integer[0]);
        int[] arr = new int[integerArray.length];
        for (int i = 0; i < integerArray.length; i++) {
            arr[i] = integerArray[i];
        }

        numbers.clear();

        System.err.println(numbers.isEmpty());
    }
}
