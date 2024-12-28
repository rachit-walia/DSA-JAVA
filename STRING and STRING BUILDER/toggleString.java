
import java.util.*;

public class toggleString {

    public static void main(String[] args) {
        // input--PhysICs
        // output-- pHYSicS

        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        // toggle

        for (int i = 0; i < str.length(); i++) {
            //P ->p

            // check --Alphabet - small,capital
            boolean flag = true;
            char ch = str.charAt(i);
            int asci = (int) ch;
            if (asci >= 97) {
                flag = false; // small

            }
            if (flag == true) {
                // capital
                asci += 32;
                char dh = (char) asci; // small
                str.setCharAt(i, dh);
            } else {
                // small
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i, dh);

            }

        }
        System.out.println(str);

    }
}
