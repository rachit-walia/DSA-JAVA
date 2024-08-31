
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse: ");
        int n = sc.nextInt();
        int rem = 0;
        int originalNumber = n;
        int reverse = 0;
        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;

        }
        System.out.println("The reverse digit is " + reverse);
        if (reverse == originalNumber) {
            System.out.print("The number is palindrome");

        } else {
            System.out.print("Not a palindrome number");
        }

    }
}
