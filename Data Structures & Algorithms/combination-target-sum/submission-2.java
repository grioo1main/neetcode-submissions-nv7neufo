class Solution {
    
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sumList  = new ArrayList<>();
        dfs(nums , 0 , target , result , sumList , 0);
        return result;
    }

    public void dfs(int[] nums, int x , int target ,List<List<Integer>> result , List<Integer> sumList , int sum)
    {
        if (sum == target){
            result.add(new ArrayList(sumList));
            return;
        }
        if (sum > target){
            return;
        }
        for ( int i = x ; i < nums.length ; i++){
            sumList.add(nums[i]);
            dfs(nums , i , target , result , sumList , sum+nums[i]);
            sumList.removeLast();
            // sum -= nums[i];
        }
    }
}
