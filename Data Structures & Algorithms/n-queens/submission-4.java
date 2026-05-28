class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[] queens = new int[n];
        dfs(0, n, queens, result);
        return result;
    }

    private void dfs(int row, int n, int[] queens, List<List<String>> result) {
        if (row == n) {
            result.add(buildBoard(queens, n));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, queens)) {
                queens[row] = col;
                dfs(row + 1, n, queens, result);
            }
        }
    }

    private boolean isSafe(int newRow, int newCol, int[] queens) {
        for (int oldRow = 0; oldRow < newRow; oldRow++) {
            int oldCol = queens[oldRow];
            if (oldCol == newCol || Math.abs(oldRow - newRow) == Math.abs(oldCol - newCol)) {
                return false;
            }
        }
        return true;
    }

    private List<String> buildBoard(int[] queens, int n) {
        List<String> board = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            char[] line = new char[n];
            Arrays.fill(line, '.');
            line[queens[row]] = 'Q';
            board.add(new String(line));
        }
        return board;
    }
}