interface myLambda {
    public void display(String str);
}


public class methodReference {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());
    }
    
    public static void main(String[] args) {
        myLambda ml = methodReference::reverse;
        ml.display("Hello");

        // for non-static method
        // methodReference mr = new methodReference();
        // myLambda ml2 = mr::reverse;
    }
}
