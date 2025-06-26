
public class factorialRecursion {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    static int fact(int n) {
        if (n < 2) {
            return n;
        }
        return n * fact(n - 1);
    }
}
