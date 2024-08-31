
import java.util.*;

public class sumoftwo {

    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers are " + sum);
    }

}
