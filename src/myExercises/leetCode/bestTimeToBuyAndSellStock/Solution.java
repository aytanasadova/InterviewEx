package myExercises.leetCode.bestTimeToBuyAndSellStock;
//o(n*n)
public class Solution {
    public int maxProfit(int[] prices) {

        int i, j;
        int maxProfit = 0;

        for (i = 0; i < prices.length; i++) {
            {
                for (j = i + 1; j < prices.length; j++) {
                    if (prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
        }
        return maxProfit;
    }
}