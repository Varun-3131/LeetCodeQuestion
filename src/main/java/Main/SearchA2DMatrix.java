package Main;

public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m * n - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int mid_val = matrix[middle / n][middle % n];

            if (mid_val == target)
                return true;
            else if (mid_val < target)
                left = middle + 1;
            else
                right = middle - 1;
        }
        return false;
    }
}
