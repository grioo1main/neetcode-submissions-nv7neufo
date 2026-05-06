class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] nums : matrix) {
            if (nums[nums.length - 1] == target) {
                return true;
            } else if (nums[nums.length - 1] > target) {
                return bSearch(nums, target);
            }
        }
        return false;
    }
    public boolean bSearch(int[] nums, int target) {
        int l = 0;
        int mid = 0;
        int r = nums.length - 1;
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] > target) {
                r = --mid;
            } else {
                l = ++mid;
            }
        }

        return false;
    }
}
