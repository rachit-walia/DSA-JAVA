
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = sc.nextLine();  // Read user input

        // Use StringBuilder to reverse the string
        StringBuilder sb = new StringBuilder(name);
        String reversed = sb.reverse().toString();  // Reverse the string

        // Compare the original string and the reversed string using .equals()
        if (name.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
