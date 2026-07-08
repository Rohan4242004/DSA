class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < minPrice){
                minPrice = prices[i];   // Stock buy
            }
            else if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;   // Stock sell
            }
        }
        return maxProfit;
    }
}