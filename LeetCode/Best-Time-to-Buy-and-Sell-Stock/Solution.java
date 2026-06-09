1class Solution {
2    public int maxProfit(int[] prices) {
3        int cost=0,profit=0;
4        int mini=prices[0];
5        for (int i=1;i<prices.length;i++){
6            cost=prices[i]-mini;
7            profit=Math.max(profit,cost);
8            mini=Math.min(prices[i],mini);
9        }
10        return profit;
11    }
12}