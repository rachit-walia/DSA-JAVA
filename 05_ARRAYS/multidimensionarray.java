
import java.util.*;

public class multidimensionarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

        // in java no. of coloums is not mandatory
        // where as no. of rows is mandatory
        //
        int[][] arr2d = {
            {1, 2, 3}, // 0th index
            {4, 5}, // 1st index
            {6, 7, 8, 9} // 2nd index
        };

        // taking input
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // taking output
        /* 
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // To print a new line after each row
        }
         */

        // output using strings method 
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

    }
}
