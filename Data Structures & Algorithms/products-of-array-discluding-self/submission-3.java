class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int l = 1;
        int r = 1;
        for (int i = 0 ; i < nums.length ; i++){
            out[i] = l;
            l*=nums[i];
        }
        System.out.println(out);
        for (int i = nums.length -1; i >= 0 ; i--){
            out[i] = out[i]*r;
            r*=nums[i];
        }
        return out;
    }
}  
