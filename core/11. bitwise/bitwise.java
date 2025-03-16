class bitwise {
    public static void main(String[] args) {
        int a=5, b=12;
        System.out.println("Old:\na: "+a+" b: "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("New\na: "+a+" b: "+b);

        byte num1=9, num2=12, c;
        c=(byte)(num1<<4);
        c=(byte)(c|num2);
        System.out.println((c&0b11110000)>>4); // num1
        System.out.println((c&0b00001111)); // num2
    }
}