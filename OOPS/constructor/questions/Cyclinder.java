
class hello {

    private int radius;
    private int height;

    public hello(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * 3.14 * radius * radius + 2 * 3.14 * radius * height;
    }

    public double volume() {
        return 3.14 * radius * radius * height;
    }

}

class Rectangle {

    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

}

public class Cyclinder {

    public static void main(String[] args) {

        hello myClinder = new hello(9, 12);
        // myClinder.setHeight(9);
        // int h = myClinder.getHeight();
        // System.out.println(h);

        myClinder.setRadius(12);
        int y = myClinder.getRadius();
        System.out.println(y);
        System.out.println(myClinder.surfaceArea());
        System.out.println(myClinder.volume());

        Rectangle r = new Rectangle();

    }
}
