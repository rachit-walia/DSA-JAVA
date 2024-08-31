// print all the three digit armstrong numbers
// take a number 
// cube every digit of it and add it.
// a=153;
//      1*1*1+5*5*5+3*3*3=153

import java.util.*;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.err.println(isArmstrong(n));

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.err.println(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;

    }
}
