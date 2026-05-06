class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int mid = 0;
        int r = nums.length - 1;
        while (l <= r) {
            mid = ((l + r) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = --mid;
            } else {
                l = ++mid;
            }
        }

        return -1;
    }
}
