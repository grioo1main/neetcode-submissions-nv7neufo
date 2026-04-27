class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        long longTarget = (long) target; 

        for (int i = 0; i < nums.length; i++) {
            long poI = longTarget - nums[i];
            // List<Integer> list = new ArrayList<>();
            for (int j = i+1; j < nums.length; j++) {
                
                long poJ = poI - nums[j];
                int l = j+1;
                int r = nums.length - 1;
                while (l < r) {
                    if (r == j) {
                        r--;
                    }
                    if (l == j) {
                        l++;
                    }
                    if (((long)(nums[r] + nums[l])) == poJ) {
                        set.add(List.of(nums[i], nums[l], nums[r], nums[j]));

                        long left = nums[l];
                        long rigth = nums[r];

                        while (l < r && nums[l] == left) l++;
                        while (l < r && nums[r] == rigth) r--;

                    } else if ((nums[r] + nums[l]) > poJ) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return set.stream().toList();
    }
}