
import java.util.*;

public class reverseWordsinString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String sentense = sc.nextLine();

        //split the string into words
        String[] words = sentense.split(" ");

        String reversedSentense = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentense = reversedSentense + words[i] + " ";
        }

        System.out.println("Reversed words in string " + reversedSentense.trim());
    }
}
