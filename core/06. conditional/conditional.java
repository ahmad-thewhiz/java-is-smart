public class conditional {
    public static void main(String[] args) {
        // Conditional statements in Java
        // Conditional statements are used to perform different actions based on different conditions.
        
        // if, else if, else
        int x = 10;
        if (x > 0) {
            System.out.println("Positive");
        } else if (x < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        int y = (x > 0) ? 1 : -1;
        System.out.println(y);

        // switch
        switch (2) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
                break;
        }

        // nested if
        int a = 10, b = 20, c = 30;
        if (a > b) {
            if (a > c) {
                System.out.println("a is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        } else {
            if (b > c) {
                System.out.println("b is the largest number");
            } else {
                System.out.println("c is the largest number");
            }
        }

        // while loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // for loop
        for (int k = 0; k < 5; k++) {
            System.out.println(k);
        }

        // for-each loop
        int[] arr = {1, 2, 3, 4, 5};
        for (int l : arr) {
            System.out.println(l);
        }

        // break statement
        for (int m = 0; m < 5; m++) {
            if (m == 3) {
                break;
            }
            System.out.println(m);
        }
        // it breaks the loop when m becomes 3

        // continue statement
        for (int n = 0; n < 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);
        }
        // it skips the iteration when n becomes 3

        
        // difference between while and do-while loop
        // The while loop checks the condition before the loop body is executed, so it is possible that the loop body may not execute at all if the condition is false from the beginning. (Entry controlled loop)
        // The do-while loop checks the condition after the loop body is executed, so the loop body is executed at least once even if the condition is false from the beginning. (Exit controlled loop)

        // difference between for and for-each loop
        // The for loop is used when you know the number of iterations in advance, and you want to iterate over a range of values.
        // The for-each loop is used when you want to iterate over each element of an array or a collection, without bothering about the index or the number of elements.
    }
}
