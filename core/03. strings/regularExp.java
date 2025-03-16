public class regularExp {
    public static void main(String[] args) {
        String str1 = "f";
        System.out.println(str1.matches("."));

        String str2="abc";
        System.out.println(str2.matches("[abc]")); // single character only

        String str3="p";
        System.out.println(str3.matches("[^abc]")); // single digit only
    
        String str4="a8";
        System.out.println(str4.matches("[a-z0-9]")); // single digit only
   
        String str5="a";
        System.out.println(str5.matches("\\w"));

        String str6="$";
        System.out.println(str6.matches("\\D"));

        String email="temp@gmail.com";
        System.out.println(email.matches(".*@gmail.com"));

        // finding if a number is binary or not
        String binary="1010";
        System.out.println(binary.matches("[01]+"));

        // finding if a number is hexadecimal or not
        String hex="1F";
        System.out.println(hex.matches("[0-9A-F]+"));

        // find if the date is in the format dd/mm/yyyy
        String date="25/12/2024";
        System.out.println(date.matches("[0-31]+/[0-12]+/[0-9]{4}")); // wrong because 0-31 matches only one character and '+' will allow more than one occurence of each
        System.out.println(date.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}"));

        // remove special characters from a string
        String str7="abc@123";
        System.out.println(str7.replaceAll("[^a-zA-Z0-9]", ""));

        // remove extra spaces from a string
        String str8="  abc   def  ";
        System.out.println(str8.replaceAll("\\s+", " ").trim());
        // trim() to remove trailing and leading spaces

        // find number of words in a string
        String str9="abc def ghi";
        System.out.println(str9.split(" ").length);
    }
}
