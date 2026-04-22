class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int r = heights.length - 1 ,  l = 0 ;
        while(l<r){

            max = Math.max(max , ( (r - l) * Math.min(heights[l] , heights[r])));
            
            if (heights[l] > heights[r]){
                r--;
            }else{
                l++;
            }

        }
        return max;
    }
}
