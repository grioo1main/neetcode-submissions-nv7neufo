class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int m = 0;

        if (nums[l] < nums[r]) {
            return nums[l];
        }
        while (l < r) {
            m = (l + r) / 2;
            
            if (nums[m] > nums[r]) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return nums[r];
    }
}
