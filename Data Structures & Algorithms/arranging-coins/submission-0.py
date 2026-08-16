class Solution:
    def arrangeCoins(self, n: int) -> int:
        limit = n
        low, high = 1, limit

        while low <= high:
            mid = (low + high) // 2
            if (mid * (mid + 1)) // 2 <= limit: 
                low = mid + 1
            else: 
                high = mid - 1
                
        return high
