class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> pq = new TreeSet<>();
        for (int i = 0; i < nums.length ; i++){
            pq.add(nums[i]);
        }

        int maxk = 0;
        int promk = 1;
        if (pq.isEmpty()) {
           return 0;
        }
        int k = pq.pollFirst();

        while (!pq.isEmpty()){
            int t = pq.pollFirst();
            if (k+1 == t){
                promk++;
            }else {
                maxk = Math.max(maxk , promk); 
                promk = 1;
            }
            k = t;
        }
        return Math.max(maxk, promk);

    }
}