class Data<T> {
    private T obj;

    public void setData(T v) {
        obj = v;
    }

    public T getData() {
        return obj;
    }
}

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

public class Generics2 {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.setData(10);

        System.out.println(d.getData());

        MyArray<Integer> arr = new MyArray<>();
        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.display();
    }
}
