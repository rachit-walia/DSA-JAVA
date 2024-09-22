
class Base {

    int x;

    public int getX() {
        return x;
    }

    // Setter should return void
    public void setX(int x) {
        this.x = x;
    }

    public void printMe() {
        System.out.println("I am a method, not a constructor");
    }
}

class Derived extends Base {

    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inherit {

    public static void main(String[] args) {
        // creating an object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // creating an object of derieved class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(542);
        System.out.println(d.getY());
    }
}
