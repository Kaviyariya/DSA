class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],profit=0,sum=0;
        for(int i=1;i<prices.length;i++){
            if (prices[i]<prices[i-1]){
                min=Integer.MAX_VALUE;
                sum+=profit;
                profit=0;
            }
            min=Math.min(prices[i],min);
            profit=Math.max(prices[i]-min,profit);
        }
        return Math.max(sum+profit,profit);
    }
}