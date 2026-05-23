class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums, start, result, temp);
        return result;
    }
    public void dfs(int[] nums, int start, List<List<Integer>> result, List<Integer> temp) {
        // if (start >= nums.length) {
            result.add(new ArrayList<>(temp));
        //     return;
        // }

        for (int i = start; i < nums.length ; i++){
        // dfs(nums, start + 1, result, temp);
        if (start < i && nums[i] == nums[i - 1]) {
            continue;
        }
        

        temp.add(nums[i]);
        dfs(nums, i + 1, result, temp);
        temp.removeLast();
        }
    }
}
