
import java.util.*;

public class reverseCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentense = sc.nextLine();

        String[] words = sentense.split(" ");

        String hello = "";
        for (int i = words.length - 1; i >= 0; i--) {
            hello = hello + words[i] + " ";
        }
        System.out.println("The output is: " + hello.trim());

    }
}
