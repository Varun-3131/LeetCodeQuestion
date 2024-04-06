package Main;

public class UniquePath_II {
    public int uniquePaths(int r, int c) {
        int[][] m = new int[r][c];
        m[r-1][c-1] = 1;
        return backtrack(m, 0, 0);
    }
    private int backtrack(int[][]m, int row, int col) {
        if (m[row][col] != 0) {
            return m[row][col];
        }
        if (row + 1 < m.length) {
            m[row][col] += backtrack(m, row + 1, col);
        }
        if (col + 1 < m[0].length) {
            m[row][col] += backtrack(m, row, col + 1);
        }
        return m[row][col];
    }
}
