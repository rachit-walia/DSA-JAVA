
class Base1 {

    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) {
        System.out.println("This is a base class constructor with a value " + x);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derieved1 extends Base1 {

    public int y;

    Derieved1() {
        super(5);
        System.out.println("This is a constructor for y");
    }

    Derieved1(int x, int y) {
        super(x);
        System.out.println("I am a overloaded constructor of derieved with values of y as: " + y);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class ChildofDerieved extends Derieved1 {

    ChildofDerieved() {
        System.out.println("I am a child of derieved constructor");
    }

    ChildofDerieved(int x, int y, int z) {
        super(x, y);
        System.out.println("I am an overloaded constructor of derieved with value of z as " + z);
    }
}

public class constructor {

    public static void main(String[] args) {
        Base1 b = new Base1();
        // Derieved1 d = new Derieved1();
        Derieved1 d = new Derieved1(14, 9);
        ChildofDerieved cd = new ChildofDerieved(5, 6, 7);

    }
}
