class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE;
        int tempSum = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            tempSum += nums[r];

            while (tempSum >= target) {
                answer = Math.min(answer, r - l + 1);                
                tempSum -= nums[l];
                l++;
            }
            
        }

        return answer == Integer.MAX_VALUE ? 0 : answer;
    }
}