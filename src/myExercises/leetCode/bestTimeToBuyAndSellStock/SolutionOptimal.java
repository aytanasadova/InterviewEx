package myExercises.leetCode.bestTimeToBuyAndSellStock;
//o(n)
public class SolutionOptimal {

    public int maxProfit(int[] prices) {
        int i;
        int maxProfit = 0, minPay = Integer.MAX_VALUE;

        for (i = 0; i < prices.length; i++) {
            if (prices[i] < minPay) minPay = prices[i];
            else if (prices[i] - minPay > maxProfit) maxProfit = prices[i] - minPay;
        }
        return maxProfit;
    }
}