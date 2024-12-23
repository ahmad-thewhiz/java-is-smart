public class strings {
    public static void main(String[] args) {
        // String is a sequence of characters
        String literalString1 = "John Doe";
        String literalString2 = "John Doe";
        System.out.println(literalString1 == literalString2); // true
        // in this case both the strings are pointing to the same memory location

        String objeString1 = new String("John Doe");
        String objeString2 = new String("John Doe");
        System.out.println(objeString1 == objeString2); // false
        // in this case both the strings are pointing to different memory locations


        // String concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        String newFullName = firstName.concat(lastName);
        System.out.println(newFullName);

        // String length
        System.out.println(fullName.length());

        // String methods
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.indexOf("Doe"));
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.contains("Doe"));
        System.out.println(fullName.replace("John", "Jane"));
        System.out.println(fullName.substring(0, 4));

        // Special characters
        // \' - single quote
        // \" - double quote
        // \\ - backslash
        // \n - new line
        // \r - carriage return
        // \t - tab
        // \b - backspace
        // \f - form feed

        // String comparison
        String str1 = "John";
        String str2 = "Doe";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // false
        System.out.println(str1.compareTo(str2)); // -1
        System.out.println(str1.compareToIgnoreCase(str2)); // -1

        // String formatting
        String name = "Ahmad";
        int age = 20;
        String country = "India";
        String university = "Private";
        double gpa = 3.52134;

        String formattedString = String.format("My name is %s and I am %d years old. I am from %s and I study in %s university and my GPA is %.3f", name, age, country, university, gpa);
        System.out.println(formattedString);

        // %b - boolean
        // %c - char
        // %d - decimal
        // %f - float
        // %s - string
        // %x - hexadecimal
        // %n - new line
        
    }
}
