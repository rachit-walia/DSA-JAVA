
public class FibonacciNumber {

    // fib n =fib(n-1)+fib(n-2);
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        // int fnm1 = fibo(n - 1);
        // int fnm2 = fibo(n - 2);
        // int fn = fnm1 + fnm2;
        // return fn;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fibo(n));
    }
}
