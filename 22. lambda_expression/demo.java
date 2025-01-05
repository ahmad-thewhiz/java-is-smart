//  lambda expressions are used primarily to define inline implementation of a functional interface, i.e., an interface with a single method only. 


@FunctionalInterface // we should have only one abstract method
interface myLambda {
    public void display();
}

// class My implements myLambda {
//     public void display() {
//         System.out.println("Hello");
//     }
// }


public class demo {
    public static void main(String[] args) {
        // My obj = new My();
        // obj.display();

        // myLambda obj=new myLambda() {
        //     public void display() {
        //         System.out.println("Hello");
        //     }
        // };
        // obj.display();

        // due to functional interface, we know there is only one method
        myLambda obj = () -> System.out.println("Hello");
        obj.display();

    }
}
