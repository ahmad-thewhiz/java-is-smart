public class variableArguments {
    // int ...x means all the received variables (it can receive an array also) will be converted into an array whereas int[] means you need to pass an array only
    
    public static void show(int i, int ...x) {
        System.out.println("Received: ");
        for(int j=i;j<x.length;j++) {
            System.out.print(x[j]+" ");
        }
        System.out.println();

    }


    public static void main(String ...args) {
        show(0, 1, 2, 3, 4, 5);
        show(0, new int[]{1, 2, 3, 4, 5});
    } 
}
