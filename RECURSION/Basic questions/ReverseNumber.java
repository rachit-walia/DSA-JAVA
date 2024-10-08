
public class ReverseNumber {

    public static void main(String[] args) {
        int n = 123456;
        System.out.println(reverse(n)); // Output will be 654321
    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev; // Return the reversed number
    }
}
