
import java.util.*;

public class weekend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // switch (n) {
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.err.println("Weekdays");
        //         break;
        //     case 6:
        //     case 7:
        //         System.err.println("Weekend");
        // }
        switch (n) {
            case 1, 2, 3, 4, 5 ->
                System.err.println("Weekdays");
            case 6, 7 ->
                System.err.println("Weekend");
        }

    }
}
