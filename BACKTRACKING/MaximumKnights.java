// tell the maximum number of knights that can be placed in a given chess board

public class MaximumKnights {

    static int maxKnights = -1;

    public static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        int i, j;

        // Case 1: 2 up, 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }

        // Case 2: 2 up, 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') {
            return false;
        }

        // Case 3: 2 down, 1 right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') {
            return false;
        }

        // Case 4: 2 down, 1 left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') {
            return false;
        }

        // Case 5: 1 up, 2 right
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') {
            return false;
        }

        // Case 6: 1 up, 2 left
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') {
            return false;
        }

        // Case 7: 1 down, 2 right
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') {
            return false;
        }

        // Case 8: 1 down, 2 left
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') {
            return false;
        }
        return true;

    }

    public static void nKnights(char[][] board, int row, int col, int num) {
        int n = board.length;
        if (row == n) {
            // base case
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        } else if (isSafe(board, row, col)) {
            board[row][col] = 'K';
            if (col != n - 1) {
                nKnights(board, row, col + 1, num + 1);
            } else {
                nKnights(board, row + 1, 0, num + 1);
            }
            board[row][col] = 'x';// backtracking
        } else {
            // not safe
            if (col != n - 1) {
                nKnights(board, row, col + 1, num);
            } else {
                nKnights(board, row + 1, 0, num);
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nKnights(board, 0, 0, 0);
    }
}
