class MyArray<T> {
    T arr[] = (T[]) new Object[10]; 
    int len = 0; 

    public void append(T v) {
        if (len < arr.length) { 
            arr[len++] = v; 
        } else {
            System.out.println("Array is full! Cannot append more elements.");
        }
    }

    public void display() {
        for (int i = 0; i < len; i++) { 
            System.out.println(arr[i]);
        }
    }
}


public class GenMethods {
    // generic method
    static <E> void show(E...list) {
        for(E e : list) {
            System.out.println(e);
        }
    }
    
    static void fun(MyArray obj) { // MyArray<?> is also valid because we are not using any type in the method - wild card
        obj.display();
    }

    public static void main(String[] args) {
        // show("Hi", "Hello", "Bye");
        // show(1, 2, 3, 4, 5);

        MyArray<String> obj = new MyArray<>();
        obj.append("Hi");
        obj.append("Hello");

        fun(obj);
        
    }
}
