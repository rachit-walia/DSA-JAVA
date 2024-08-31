
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // to find the maximum of three numbers
        // int largest = a;
        // if (largest < b) {
        //     largest = b;
        // } else if (largest < c) {
        //     largest = c;
        //
        // }
        //
        //
        // int max = 0;
        // if (a > b) {
        //     max = a;
        // }
        // if (c > max) {
        //     max = c;
        // }
        //
        int max = Math.max(c, Math.max(a, b));

        // System.out.println(max);
    }
}
