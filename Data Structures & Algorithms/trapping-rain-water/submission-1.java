class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int answer = 0;
        int l = 0;
        int r = n - 1;
        int maxLeft = 0;
        int maxRight = 0;

        while (l < r) {
            if (nums[l] < nums[r]) {
                if (nums[l] >= maxLeft) {
                    maxLeft = nums[l];
                } else {
                    answer += maxLeft- nums[l];
                }
                l++;
            }else {
                if (nums[r] >= maxRight) {
                    maxRight = nums[r];
                } else {
                    answer += maxRight - nums[r];
                }
                r--;
            }
        }
        return answer;
    }
}
