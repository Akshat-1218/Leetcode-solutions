class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        for(int i=1;i<n;i++){
            if(min<prices[i]){
                profit = Math.max(prices[i]-min,profit);
            }
            else{
                min = prices[i];
            }
        }
        return profit;
    }
}