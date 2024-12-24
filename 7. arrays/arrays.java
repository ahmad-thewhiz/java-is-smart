import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        char vowels[] = new char[5];
        vowels[0] = 'A';
        vowels[1] = 'E';
        vowels[2] = 'U';
        vowels[3] = 'O';
        vowels[4] = 'I';

        System.out.println("Vowels are: "+Arrays.toString(vowels));
        System.out.println("Number of vowels: "+vowels.length);
        Arrays.sort(vowels, 0, 5);
        System.out.println("Sorted vowels are: "+Arrays.toString(vowels));

        // Array Methods
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied numbers are: "+Arrays.toString(numbersCopy));

        int[] numbersCopyOfRange = Arrays.copyOfRange(numbers, 1, 3);
        System.out.println("Copied numbers of range are: "+Arrays.toString(numbersCopyOfRange));

        int[] numbersFill = new int[5];
        Arrays.fill(numbersFill, 10);
        System.out.println("Filled numbers are: "+Arrays.toString(numbersFill));

        System.out.println("Check if numbers and numbersCopy are equal: "+Arrays.equals(numbers, numbersCopy));
        System.out.println("Compare numbers and numbersCopy: "+Arrays.compare(numbers, numbersCopy));

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 4, 3};

        System.out.println("Mismatch index: "+Arrays.mismatch(arr1, arr2));
        System.out.println("Hash code of arr1: "+Arrays.hashCode(arr1));
        System.out.println("Hash code of arr2: "+Arrays.hashCode(arr2));

        // stream
        int[] numbersStream = {1, 2, 3, 4, 5};
        Arrays.stream(numbersStream).forEach(n -> System.out.print(n+" "));
        System.out.println();

        // parallelPrefix
        int[] numbersParallelPrefix = {1, 2, 3, 4, 5};
        Arrays.parallelPrefix(numbersParallelPrefix, (a, b) -> a * b);
        System.out.println("Parallel Prefix: "+Arrays.toString(numbersParallelPrefix));

        // parallelSetAll
        int[] numbersParallelSetAll = new int[5];
        Arrays.parallelSetAll(numbersParallelSetAll, i -> i+1);
        System.out.println("Parallel Set All: "+Arrays.toString(numbersParallelSetAll));

        // sort with comparator
        String[] names = {"Ahmad", "Ali", "Zain", "Khan"};
        Arrays.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: "+Arrays.toString(names));

    }
}
