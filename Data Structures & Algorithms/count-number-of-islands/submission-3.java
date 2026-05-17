class Solution {
    public int numIslands(char[][] grid) {
        if (grid.length == 0) {
            return 0;
        }
        int counter = 0;
        boolean[][] bool = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (bool[i][j] == true) {
                    continue;
                }

                if (grid[i][j] == '1') {
                    dfs(bool, i, j, grid);
                    counter++;
                }
            }
        }
        return counter;
    }
    public void dfs(boolean[][] bool, int i, int j, char[][] grid) {
        if (i >= grid.length || i < 0 || j >= grid[0].length || j < 0
        || grid[i][j] == '0' || bool[i][j]) {
            return;
        }

        // if (bool[i][j]) {
        //     return;
        // }

        // if (grid[i][j] == '0') {
        //     return;
        // }
        bool[i][j] = true;
        dfs(bool, i + 1, j, grid);
        dfs(bool, i - 1, j, grid);
        dfs(bool, i, j + 1, grid);
        dfs(bool, i, j - 1, grid);
    }
}
