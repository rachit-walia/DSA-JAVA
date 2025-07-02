/*

                            ****
                            ***
                            **
                            *

 */

public class ReverseTriangle {

    public static void main(String[] args) {
        int n = 4;
        print(n, 0);
    }

    static void print(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            print(row, col + 1);
        } else {
            System.out.println();
            print(row - 1, 0);
        }
    }
}
