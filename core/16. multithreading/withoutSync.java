class MyData {
    void display(String str) {
        for(int i=0;i<str.length();i++)
            System.out.println(str.charAt(i));
    }
}

class MyThread extends Thread {
    MyData d;
    
    MyThread(MyData dat) { 
        d=dat;
    };
    
    public void run() {
        d.display("abcdef ghijhklmn opqrstu bvwxyz");
    }
    
}

class MyThread2 extends Thread {
    MyData d;
    
    MyThread2(MyData dat) { 
        d=dat;
    };
    
    public void run() {
        d.display("12345 678910 1112131415 1617181920");
    }
}

public class withoutSync {
    public static void main(String[] args) {
        MyData d=new MyData();
        MyThread t1=new MyThread(d);
        MyThread2 t2=new MyThread2(d);

        t1.start();
        t2.start();
    }
}
