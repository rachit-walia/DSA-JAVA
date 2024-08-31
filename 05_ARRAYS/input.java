
import java.util.*;

public class input {

    public static void main(String[] args) {

        // arrays of primitives
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 455;
        // arr[3] = 445;
        // arr[4] = 545;
        System.out.println(arr[3]); // output: 445

        // input using loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing  each element 
        //
        // for (int i = 0; i < arr.length; i++) {
        //     System.err.print(arr[i] + " ");
        // }

        // printing array through enchanched method
        for (int num : arr) {// for every element of the array,print the element
            System.out.print(num + " "); // here num represent element of the array
        }

        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
