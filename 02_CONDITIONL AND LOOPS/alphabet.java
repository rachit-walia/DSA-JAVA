
import java.util.*;

public class alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        // trim --> removes the spaces 
        // char at--> gives the charater at the position 
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
        System.out.println(ch);

    }
}
