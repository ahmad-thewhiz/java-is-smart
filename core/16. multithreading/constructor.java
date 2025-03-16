class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        setPriority(MAX_PRIORITY);
    }
    public void run() {
        int count=0;
        while(true) {
            System.out.println(count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class constructor {
    public static void main(String[] args) {
        MyThread t=new MyThread("thread 1");

        System.out.println(t.threadId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState());
        System.out.println(t.isAlive());

        t.start();
        System.out.println(t.getState());

        t.interrupt();
        
    }
}
