
public class LearnInterface {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.sing();
    }
}

interface Human {

    void sing();
}

interface Animal {

    // public abstract void eats();
    void eats();

}

class Monkey implements Animal, Human {

    @Override
    public void eats() {
        System.out.println("Monkey is eating");
    }

    @Override
    public void sing() {
        System.out.println("singing");
    }
}
