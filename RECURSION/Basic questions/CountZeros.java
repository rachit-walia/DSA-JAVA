
public class CountZeros {

    public static void main(String[] args) {
        int n = 302130405;
        System.out.println(zeros(n));
    }

    static int zeros(int n) {
        if (n == 0) {
            return 0; // Base case: no more digits to process
        }

        // Extract the last digit
        int rem = n % 10;

        // If the last digit is zero, add 1 to the result of the recursive call
        if (rem == 0) {
            return 1 + zeros(n / 10);
        } else {
            return zeros(n / 10); // If not zero, continue recursion
        }
    }
}
