
public class RatMaze {

    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int count = maze(1, 1, rows, cols);
        System.out.println(count);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        // Base case: If the rat reaches the destination, return 1
        if (sr == er && sc == ec) {
            return 1;
        }

        // Out of bounds condition
        if (sr > er || sc > ec) {
            return 0;
        }

        // Recursive calls to move down and right
        int downWays = maze(sr + 1, sc, er, ec);
        int rightWays = maze(sr, sc + 1, er, ec);

        return downWays + rightWays;
    }
}
