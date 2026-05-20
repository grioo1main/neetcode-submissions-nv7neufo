class Solution {
    int len = 0;
    int[] x;
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        len = nums.length;
        x = nums;
        dfs(0, new ArrayList<Integer>());
        return ans;
    }
    public void dfs(int i, List<Integer> nums) {
        if (i >= len) {
            return;
        }

        dfs(i + 1, nums);
        if (i == len-1 ){
            ans.add(new ArrayList<>(nums));
        }

        nums.add(x[i]);
        dfs(i + 1, nums);
        if (i == len-1 ){
            ans.add(new ArrayList<>(nums));
        }
        nums.removeLast();
    }
}
