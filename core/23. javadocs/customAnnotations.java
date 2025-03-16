
@interface MyAnnotation {
    String name();
    String value();
    String date() default "07-01-2024";
}

@MyAnnotation(name = "class", value = "Hello, World!")
public class customAnnotations {
    @MyAnnotation(name = "method", value = "Hello, World!")
    public static void main(String[] args) {
        @MyAnnotation(name = "local variable", value = "Hello, World!")
        int x = 10;

        System.out.println(x);
    }
}
