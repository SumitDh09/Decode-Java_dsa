package LeetcodeProblems;

public class StockProfitWithFee {
    public static void main(String[] args) {
        StockProfitWithFee solution = new StockProfitWithFee();
        int[] prices1 = {1, 3, 2, 8, 4, 9};
        int fee1 = 2;
        System.out.println(solution.maxProfit(prices1, fee1)); // Output: 8

        int[] prices2 = {1, 3, 7, 5, 10, 3};
        int fee2 = 3;
        System.out.println(solution.maxProfit(prices2, fee2)); // Output: 6
    }

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] hold = new int[n]; // Max profit when holding a stock
        int[] cash = new int[n]; // Max profit when not holding a stock

        hold[0] = -prices[0]; // If we buy the stock on the first day
        cash[0] = 0; // If we do nothing on the first day

        for (int i = 1; i < n; i++) {
            hold[i] = Math.max(hold[i - 1], cash[i - 1] - prices[i]);
            cash[i] = Math.max(cash[i - 1], hold[i - 1] + prices[i] - fee);
        }

        return cash[n - 1]; // The maximum profit will be in cash[n-1]
    }
}
