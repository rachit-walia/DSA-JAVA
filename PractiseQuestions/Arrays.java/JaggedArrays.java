
import java.util.*;

public class JaggedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows for your jagged arrays: ");
        int rows = sc.nextInt();

        // declaring the jagged arrays
        int[][] jaggedArr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("Entert the number of coloums for row " + (i + 1) + " ");
            int cols = sc.nextInt();
            jaggedArr[i] = new int[cols];
            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArr[i][j] = sc.nextInt();
            }
        }

        // Print the jagged array
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArr.length; i++) {
            for (int j = 0; j < jaggedArr[i].length; j++) {
                System.out.print(jaggedArr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

}
