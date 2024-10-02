// calling a recursion using a formula is known as recurrence relation

public class FibonacciNumber {

    public static void main(String[] args) {
        System.out.println(fibo(6));

    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
// last recursion in called tail recursion 

// the formula for fiboinacci is: 
