class MyThread extends Thread {
    public void run() {
        int count=0;
        while(true) 
            System.out.println(count++ + " My thread");       
    }
}

public class daemon {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        // t.setDaemon(true);
        t.start();

        int count=0;
        while(true) {
            System.out.println(count++ + " Main thread");
            Thread.yield(); // Static method that temporarily pauses current thread, Gives other threads of same priority a chance to execute
        }
        // Thread mainThread=Thread.currentThread();
        // try {
        //     mainThread.join();
        // } catch (InterruptedException e) {
        //     System.out.println(e);
        // }

        // try {
        //     Thread.sleep(100);
        // } catch (Exception e) {
        //     System.out.println(e);
        // }
    }
}
