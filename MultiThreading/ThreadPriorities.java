
public class ThreadPriorities {

    public static void main(String[] args) {
        // Ready queue: T1, T2, T3
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        Mythr3 t3 = new Mythr3();

        // Set thread priority for t3 (Maximum Priority)
        t3.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        t1.start();
        t2.start();
        t3.start();
    }
}

class Mythr1 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("This is my thread 1");
            try {
                Thread.sleep(50);  // Give other threads a chance to run
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Mythr2 extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("This is my thread 2");
            try {
                Thread.sleep(50);  // Give other threads a chance to run
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Mythr3 extends Thread {

    @Override
    public void run() {
        System.out.println("This is my thread 3");
    }
}
