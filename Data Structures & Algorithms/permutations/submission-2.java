class Solution {
    public List<List<Integer>> permute(int[] nums) {
                
        boolean[] bool = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(nums , bool , result , temp);
        return result;


    }
    public void dfs(int[] nums, boolean[] bool, List<List<Integer>> result, List<Integer> temp) {
        if (temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
        }

        for (int i = 0 ; i < nums.length ; i++){
            if (bool[i]){continue;}
            temp.add(nums[i]);
            bool[i] = true;
            dfs(nums , bool , result , temp);
            temp.removeLast();
            bool[i] = false;
        }
    }
}
