class Solution {
    // КАПИТАН
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0; 
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                
                if (grid[i][j] == 1) {
                    
                    int currentArea = dfs(grid, i, j);
                    
                    maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        
        grid[i][j] = 0;
        
        int down  = dfs(grid, i + 1, j);
        int up    = dfs(grid, i - 1, j);
        int right = dfs(grid, i, j + 1);
        int left  = dfs(grid, i, j - 1);
        System.out.println(left + " ");
        
        return down + left + right + up + 1;
        
    }
}