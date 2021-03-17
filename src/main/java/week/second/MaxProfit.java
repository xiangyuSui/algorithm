package week.second;

/**
 * @Description
 * @ClassName MaxProfit
 * @Author Xander Sui
 * @Date 2021/3/17
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (length < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < length; i++) {
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }
}
