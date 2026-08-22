class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(i , j , grid):
            if (i >= len(grid) or i < 0 or j < 0 or j >= len(grid[0])
            or grid[i][j] == "0"):
                return 
            grid[i][j] = "0"
            dfs(i + 1, j, grid)
            dfs(i - 1, j, grid)
            dfs(i, j + 1, grid)
            dfs(i, j - 1, grid)
        
        counter = 0
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == "0":
                    continue
                else:
                    dfs(i , j , grid)
                    counter+=1
        return counter

            