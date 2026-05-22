class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, target, result, sumList, 0);
        return result;
    }

    public void dfs(
        int[] nums, int x, int target, List<List<Integer>> result, List<Integer> sumList, int sum) {
        if (sum == target) {
            result.add(new ArrayList(sumList));
            return;
        }
        for (int i = x; i < nums.length; i++) {
            if (sum + nums[i] > target) {
                break; 
            }
            if (i > x && nums[i] == nums[i - 1]) {
                continue;
            }
            sumList.add(nums[i]);
            dfs(nums, i + 1, target, result, sumList, sum + nums[i]);
            sumList.removeLast();
        }
    }
}
