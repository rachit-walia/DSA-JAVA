
public class fiboo {

    public static void main(String[] args) {
        System.out.println(hello(6));

    }

    static int hello(int n) {
        if (n < 2) {
            return n;
        }
        return hello(n - 1) + hello(n - 2);
    }
}
