class My implements Runnable {
    public void run() {
        int i=1;
        while(true) {
            System.out.println(i+" Hello");
            i++;
        }
    }
}

class runnableInterface {
    public static void main(String args[]) {
        My m=new My();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while(true) {
            System.out.println(i+" world!");
            i++;
        }
    }
}