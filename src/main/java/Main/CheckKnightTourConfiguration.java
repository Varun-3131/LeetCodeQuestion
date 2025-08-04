package Main;

public class CheckKnightTourConfiguration {
    boolean isValid(int[][] grid, int r, int c, int n, int expValue) {
        if (r < 0 || c < 0 || r >= n || c >= n || grid[r][c] != expValue) {
            return false;
        }

        if (expValue == n * n - 1) {
            return true;
        }

        if (isValid(grid, r - 2, c - 1, n, expValue + 1)) return true;
        if (isValid(grid, r - 2, c + 1, n, expValue + 1)) return true;
        if (isValid(grid, r - 1, c - 2, n, expValue + 1)) return true;
        if (isValid(grid, r - 1, c + 2, n, expValue + 1)) return true;
        if (isValid(grid, r + 1, c - 2, n, expValue + 1)) return true;
        if (isValid(grid, r + 1, c + 2, n, expValue + 1)) return true;
        if (isValid(grid, r + 2, c - 1, n, expValue + 1)) return true;
        if (isValid(grid, r + 2, c + 1, n, expValue + 1)) return true;

        return false;
    }

    public boolean checkValidGrid(int[][] grid) {
        return isValid(grid, 0, 0, grid.length, 0);
    }
}
