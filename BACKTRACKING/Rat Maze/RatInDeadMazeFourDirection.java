
public class RatInDeadMazeFourDirection {

    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int[][] maze = {
            {1, 0, 1, 1, 1, 1},
            {1, 1, 1, 1, 0, 1},
            {0, 1, 1, 1, 1, 1},
            {0, 0, 1, 0, 1, 1}
        };

        boolean[][] isVisited = new boolean[rows][cols];
        solveMaze(0, 0, rows - 1, cols - 1, "", maze, isVisited);
    }

    private static void solveMaze(int sr, int sc, int er, int ec, String path, int[][] maze, boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec || maze[sr][sc] == 0 || isVisited[sr][sc]) {
            return;
        }

        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        isVisited[sr][sc] = true;

        // Move Right
        solveMaze(sr, sc + 1, er, ec, path + "R", maze, isVisited);
        // Move Down
        solveMaze(sr + 1, sc, er, ec, path + "D", maze, isVisited);
        // Move Left
        solveMaze(sr, sc - 1, er, ec, path + "L", maze, isVisited);
        // Move Up
        solveMaze(sr - 1, sc, er, ec, path + "U", maze, isVisited);

        isVisited[sr][sc] = false;
    }
}
