public class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == '.') {
                    for (char num = '1'; num <= '9'; num++) {
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (solve(board)) return true;
                            board[row][col] = '.'; // backtrack
                        }
                    }
                    return false; // no valid number found
                }
            }
        }
        return true; // board is solved
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num || 
                board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num)
                return false;
        }
        return true;
    }

    // Optional: for testing locally (not needed on LeetCode)
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
