package LeetcodeProblems.LeetcodeP2;

public class MinimumCostForTickets {
    public static void main(String[] args) {
        MinimumCostForTickets solution = new MinimumCostForTickets();
        int[] days = {1, 4, 6, 7, 8, 20};
        int[] costs = {2, 7, 15};
        System.out.println("Minimum cost for tickets: " + solution.mincostTickets(days, costs));

        int[] days2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31};
        int[] costs2 = {2, 7, 15};
        System.out.println("Minimum cost for tickets: " + solution.mincostTickets(days2, costs2));
    }

    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[days[n - 1] + 1];
        boolean[] travelDays = new boolean[days[n - 1] + 1];

        for (int day : days) {
            travelDays[day] = true;
        }

        for (int i = 1; i < dp.length; i++) {
            if (!travelDays[i]) {
                dp[i] = dp[i - 1];
                continue;
            }
            dp[i] = dp[i - 1] + costs[0];
            dp[i] = Math.min(dp[i], dp[Math.max(0, i - 7)] + costs[1]);
            dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
        }

        return dp[days[n - 1]];
    }
}
