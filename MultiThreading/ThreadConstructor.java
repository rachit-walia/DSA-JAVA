
public class ThreadConstructor {

    public static void main(String[] args) {
        Mythr t = new Mythr("rachit");
        t.start();
    }
}

class Mythr extends Thread {

    public Mythr(String name) {
        super(name);
    }

    public void run() {
        while (true) {
            System.out.println("I am a thread");
        }
    }
}
