class Solution {
    public int maxProfit(int[] prices) {

        int minday = Integer.MAX_VALUE;
        int maxProf = 0;
        int profit;

        for ( int i = 0 ; i<prices.length ;i++){

           minday = Math.min(minday,prices[i]);
           profit = prices[i] -minday;
           if (profit > 0){
          maxProf = Math.max(profit, maxProf);
           }
            

        }
        return maxProf;
        
    }
}
