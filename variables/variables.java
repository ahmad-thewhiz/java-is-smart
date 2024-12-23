class Variables {
    public static void main(String args[]) {
        // integer types
        byte num1 = 100; // 8-bit signed integer (range: -128 to 127)
        short num2 = 1000; // 16-bit signed integer (range: -32,768 to 32,767)
        int num3 = 100000; // 32-bit signed integer (range: -2^31 to 2^31-1)
        // by default, integer literals are of int type
        long num4 = 1000000000L; // 64-bit signed integer (range: -2^63 to 2^63-1)
        // we have to append L at the end to let compiler know that it is a long type

        // floating-point types
        float num5 = 100.0f; // 32-bit single precision floating point with 7 decimal digits and range of -1.4e-45 to 3.4e38
        // we have to append f at the end to let compiler know that it is a float type
        double num6 = 100.0; // 64-bit double precision floating point with 16 decimal digits and range of -4.9e-324 to 1.8e308
        // by default, floating-point literals are of double type
        
        // boolean type
        boolean flag = true; // 1-bit true or false

        // character type
        char copyrightSymbol = '\u00A9'; // 16-bit Unicode character (range: 0 to 65,535)

        // string type
        String str = "Hello, World!"; // sequence of characters

        System.out.println("Copyright symbol: " + copyrightSymbol);
    }
}