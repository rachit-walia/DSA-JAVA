
import java.util.*;

public class main {

    public static void main(String[] args) {
        // Use ArrayList<Object> to allow different types
        ArrayList<Object> arr = new ArrayList<>();
        arr.add("Str");
        arr.add(54);
        arr.add(60);

        // Specify the type when creating a generic object
        Mygeneric<String> g1 = new Mygeneric<>(23, "Hello");

        // Print values
        System.out.println(g1.getT1());  // Outputs "Hello"
        System.out.println(g1.getVal());  // Outputs 23
    }
}

class Mygeneric<T1> {

    private int val;
    private T1 t1;

    // Constructor with generic type parameter
    public Mygeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }

    // Getter for 'val'
    public int getVal() {
        return val;
    }

    // Setter for 'val'
    public void setVal(int val) {
        this.val = val;
    }

    // Getter for generic type T1
    public T1 getT1() {
        return t1;
    }

    // Setter for generic type T1
    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}
