class Solution {
    public boolean exist(char[][] board, String word) {
        char ch = word.charAt(0);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (ch == board[i][j]) {
                    if (dfs(board, i, j, 0, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, int i, int j, int currLen, String word) {
        if (currLen == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || board[i][j] == '#') {
            return false;
        }

        char ch = board[i][j];
        if (word.charAt(currLen) == ch) {
            board[i][j] = '#';
            boolean s1 = dfs(board, i + 1, j, currLen + 1, word);
            boolean s2 = dfs(board, i - 1, j, currLen + 1, word);
            boolean s3 = dfs(board, i, j + 1, currLen + 1, word);
            boolean s4 = dfs(board, i, j - 1, currLen + 1, word);
            board[i][j] = ch;

            return s1 || s2 || s3 || s4;
        }
        return false;
    }
}
