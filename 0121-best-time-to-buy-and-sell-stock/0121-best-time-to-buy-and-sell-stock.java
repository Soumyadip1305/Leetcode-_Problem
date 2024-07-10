class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int prevMin=prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<prevMin){
                prevMin=prices[i];
            }
            maxi=Math.max(prices[i]-prevMin,maxi);
        }
        return maxi;
    }
}