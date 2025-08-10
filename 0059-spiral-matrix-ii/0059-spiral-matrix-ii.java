class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {
            // left -> right on top row
            for (int j = left; j <= right; j++) mat[top][j] = val++;
            top++;

            // top -> bottom on right column
            for (int i = top; i <= bottom; i++) mat[i][right] = val++;
            right--;

            if (top <= bottom) {
                // right -> left on bottom row
                for (int j = right; j >= left; j--) mat[bottom][j] = val++;
                bottom--;
            }

            if (left <= right) {
                // bottom -> top on left column
                for (int i = bottom; i >= top; i--) mat[i][left] = val++;
                left++;
            }
        }

        return mat;
    }
}
