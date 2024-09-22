
class Base1 {

    Base1() {
        System.err.println("I am a constructor");
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
        System.out.println("This is a constructor for y");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class constructor {

    public static void main(String[] args) {
        Base1 b = new Base1();
        Derieved1 d = new Derieved1();

    }
}
