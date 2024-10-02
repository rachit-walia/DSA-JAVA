
public class Product1toN {

    public static void main(String[] args) {
        System.out.println(product(5));
    }

    static int product(int n) {
        if (n == 0) {
            return 1;
        }
        return n * product(n - 1);
    }
}
