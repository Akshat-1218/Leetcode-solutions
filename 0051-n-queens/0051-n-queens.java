class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        // Initially board mein '.' bhar do
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, ans, n);

        return ans;
    }
    private void backtrack(int row, char[][] board,
                           List<List<String>> ans, int n) {

        // Saari rows mein queen place ho gayi
        if (row == n) {
            List<String> current = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                current.add(new String(board[i]));
            }

            ans.add(current);
            return;
        }

        // Current row ke har column ko try karo
        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                // Queen place karo
                board[row][col] = 'Q';

                // Next row par jao
                backtrack(row + 1, board, ans, n);

                // Queen remove karo = BACKTRACKING
                board[row][col] = '.';
            }
        }
    }

    private boolean isSafe(char[][] board, int row, int col, int n) {

        // Same column check
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}