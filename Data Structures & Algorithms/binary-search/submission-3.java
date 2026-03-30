class Solution {
    public int search(int[] nums, int target) {

        int r = nums.length -1, l = 0;
        while (l<=r){
            int mid = (l+r)/2;
            if (nums[mid] == target){
                return mid;
            }else if (target < nums[mid]){
                r = mid;
                r--;
            }else{
                l = mid;
                l++;
            }
        }
        return -1;
    }
}
