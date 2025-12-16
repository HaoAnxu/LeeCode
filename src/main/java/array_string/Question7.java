package array_string;

/**
 * 【买卖股票的最佳时机】
 *
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * @Author: haoanxu
 * @Date: 2025/12/16
 */
public class Question7 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int cheapest = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(prices[i] - cheapest, profit);
            if (prices[i] < cheapest) {
                cheapest = prices[i];
            }
        }
        return profit;
    }

    //过于耗时
    public static int maxProfit_de(int[] prices) {
        int profit = 0;
        int buyDay = 0;
        int sellDay = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if(prices[j] > prices[i]){
                    if(prices[j] - prices[i] > profit){
                        profit = prices[j] - prices[i];
                        buyDay = i+1;
                        sellDay = j+1;
                    }
                }
            }
        }
        System.out.println("第"+buyDay+"天买入，第"+sellDay+"天卖出，利润为："+profit);
        return profit;
    }
}
