
import java.util.*;

public class reverse1 {

    // Approach 1
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        String reverse = str.reverse() + "";
        System.out.println("the reversed string is: " + reverse);

    }
     */
    // Approach 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // convert the string into character array
        char[] charArray = str.toCharArray();
        // reverse the character array

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        String reversedString = new String(charArray);
        System.out.println("The reversed string is: " + reversedString);

    }
}
