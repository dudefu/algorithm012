
/**
 * 买卖股票的最佳时机 II
 */
class Solution {
    public int maxProfit(int[] prices) {
       int max=0;
        for(int i=1,len=prices.length;i<len;i++){
            if(prices[i]>prices[i-1])
                max+=prices[i]-prices[i-1];
        }
        return max;
    }
}
