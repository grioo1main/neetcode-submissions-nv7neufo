class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        int n = nums.length;
        TreeMap<Integer , Integer> map = new TreeMap<>();
        for (int i = 0 ; i < k ; i++){
            map.merge(nums[i], 1, Integer::sum);
        }
        int[] array = new int[(n-k+1)];
        while (r < n){
            array[l] = map.lastKey();
            map.computeIfPresent(nums[l], (key, value) -> value > 1 ? value - 1 : null);
            l++;
            r++;
            if (r < n){
                map.merge(nums[r], 1, Integer::sum);
            }
            
            
        }
        return array;
    }
}
