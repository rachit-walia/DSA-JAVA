
public class LearnAbstarct {

    public static void main(String[] args) {
        // Vechile v1 = new vechile();
        Car c1 = new Car();
        c1.accelerate();
        c1.brake(5);
        c1.braking();
    }

}

abstract class Vechile {

    abstract void accelerate();

    abstract int brake(int wheels);

    void braking() {
        System.out.println("braking is applied");
    }

}

class Car extends Vechile {

    @Override
    void accelerate() {
        System.out.println("My car is accelerating: ");
    }

    @Override
    int brake(int wheels) {
        System.out.println("car breaks are applied");
        return wheels;
    }

    void braking() {
        System.out.println("braking is applied yoo");
    }

}
