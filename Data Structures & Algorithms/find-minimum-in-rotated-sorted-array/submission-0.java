class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        if (nums[l] < nums[r]) {
            return nums[l];
        }

        while (l < r) {
            int med = l + (r - l) / 2;

            if (nums[med] > nums[r]) {
                l = med + 1;
            } else {
                r = med;
            }
        }
        return nums[l];
    }
}
