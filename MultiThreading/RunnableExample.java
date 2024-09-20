
public class RunnableExample {  // Renamed the class to avoid conflict

    public static void main(String[] args) {
        // Create instances of the Runnable classes
        MyThreadRunnable1 r1 = new MyThreadRunnable1();
        MyThreadRunnable2 r2 = new MyThreadRunnable2();

        // Create Thread objects and pass the Runnable objects to them
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start the threads
        t1.start();
        t2.start();
    }
}

class MyThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am a thread, not a threat - Runnable 1");
    }
}

class MyThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I am a thread, not a threat - Runnable 2");
    }
}
