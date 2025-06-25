
public class fibonacci {

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Fibonacci number at position " + n + " is: " + fibo(n));
    }

    public static int fibo(int n) {
        // base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // recursive step
        return fibo(n - 1) + fibo(n - 2);
    }
}
