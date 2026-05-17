class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE,profit=0,sum=0;
        for(int i=0;i<prices.length;i++){
            if(profit!=0 && prices[i]-min<profit){
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