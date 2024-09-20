
public class ThreadClass {

    public static void main(String[] args) {
        // Create new thread instances
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();

        // Start both threads
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        // Run the thread with continuous printing
        while (true) {
            System.out.println("My thread is running");
            System.out.println("I am running");

        }
    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        // Run the thread with continuous printing
        while (true) {
            System.out.println("My thread2 is running");
            System.out.println("I am chatting with her");
        }
    }
}
