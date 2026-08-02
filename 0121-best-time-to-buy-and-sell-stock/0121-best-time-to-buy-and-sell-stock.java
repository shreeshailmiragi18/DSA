class Solution {
    public int maxProfit(int[] prices) {
        int profit =0;
        int bestBuy = prices[0];
        for(int i=1;i<prices.length;i++){
            bestBuy = Math.min(bestBuy, prices[i-1]);
            if(prices[i]> bestBuy){
                profit = Math.max(profit, prices[i]-bestBuy);
            }
        }
        return profit;
    }
}