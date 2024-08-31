
import java.util.Arrays;

public class varArgs {

    public static void main(String[] args) {
        fun(2, 3, 4, 56, 87);
        multiple(2, 4, "Rachit", "walia");
    }

    static void multiple(int a, int b, String... v) {

    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

// ... is called varibale number of arguments
// ... variable argument is always comes at the end

