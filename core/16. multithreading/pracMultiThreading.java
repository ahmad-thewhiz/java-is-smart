// class MyThread extends Thread {
//     public void run() {
//         int i=1;
//         while(true) {
//             System.out.println(i+" Hello");
//             i++;
//         }
//     }
// }

// class pracMultiThreading {
//     public static void main(String args[]) {
//         MyThread t=new MyThread();
//         t.start();
//         int i=1;
//         while(true) {
//             System.out.println(i+" world!");
//             i++;
//         }
//     }
// }

class Test extends Thread {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello");
            i++;
        }
    }

    public static void main(String args[]) {
        Test t=new Test();
        t.start();
        int i=1;
        while(true) {
            System.out.println(i+" world");
            i++;
        }
    }
}