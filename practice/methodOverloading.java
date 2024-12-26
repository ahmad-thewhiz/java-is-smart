public class methodOverloading {
    // overloaded method to calculate areas
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double area(double length, double width) {
        return length * width;
    }


    // overloaded method to reverse a int or array
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int[] reverse(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }


    // overloaded method to validate name and age
    public static boolean validate(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public static boolean validate(int age) {
        return age >= 0 && age <= 100;
    }

    public static void main(String args[]) {
        double radius = 5.0;
        double length = 5.0;
        double width = 10.0;

        System.out.println("Area of circle: " + area(radius));
        System.out.println("Area of rectangle: " + area(length, width));

        int number = 12345;
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Reversed number: " + reverse(number));
        System.out.print("Reversed array: ");
        for (int i : reverse(array)) {
            System.out.print(i + " ");
        }

        String name = "John";
        int age = 25;

        System.out.println("\nName is valid: " + validate(name));
        System.out.println("Age is valid: " + validate(age));
    }
}
