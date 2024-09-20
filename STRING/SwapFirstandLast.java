
import java.util.*;

public class SwapFirstandLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=sc.nextInt();
        String name = sc.nextLine();
        String result = swapFirstLast(name);
        System.out.println("Original String: " + name);
        System.out.println("String after swapping first and last characters: " + result);

    }

    public static String swapFirstLast(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char firstLetter = str.charAt(0);
        char LastLetter = str.charAt(str.length() - 1);

        String Middle = str.substring(1, str.length() - 1);

        return LastLetter + Middle + firstLetter;
    }
}
