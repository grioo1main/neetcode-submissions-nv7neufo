class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        ans = -1
        counter = 0
        dq = deque()
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    counter+=1
                elif grid[i][j] == 2:
                    dq.append((i , j))
        l = len(dq)
        if counter == 0:
            return 0
        directions = [(0, 1), (0, -1), (1, 0), (-1, 0)]
        while len(dq) > 0:
            level = len(dq)
            ans += 1
            for i in range(level):
                l , r = dq.popleft()
                for dr, dc in directions:
                    nl, nr = l + dr, r + dc  
                    if nl < 0 or nr < 0 or nl >= len(grid) or nr >= len(grid[0]) or grid[nl][nr] != 1:
                        continue
                    counter -= 1
                    grid[nl][nr] = 2
                    dq.append((nl, nr))
        return -1 if counter > 0 else ans
                


                

