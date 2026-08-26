class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        lenght = len(nums)
        visited = [-1] * (lenght)
        def dfs(n: int) -> int:
            if visited[n] != -1:
                return visited[n]
            print("зашли в дфс", n)
            ans = 1
            for i in range(n+1 , lenght):
                if nums[i] > nums[n]:
                    ans = max(ans , 1+dfs(i))
            visited[n] = ans
            print("---------- вышли дфс", n)
            return ans
        ans = 0
        for i in range(lenght):
            ans = max(ans , dfs(i))
        return ans


