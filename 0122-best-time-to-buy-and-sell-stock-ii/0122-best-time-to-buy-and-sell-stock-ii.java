class Solution {
    public int maxProfit(int[] prices) {
        int pro=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1] < prices[i]){
                pro+=prices[i] - prices[i-1] ;
            }
        }
        return pro;
    }
}