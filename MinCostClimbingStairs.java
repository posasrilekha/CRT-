public class MinCostClimbingStairs {

    // DP array version
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        // Can end on last or second last step
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    // Space optimized version
    public static int minCostClimbingStairsOptimized(int[] cost) {
        int n = cost.length;
        if (n == 0) return 0;
        if (n == 1) return cost[0];

        int prev2 = cost[0];
        int prev1 = cost[1];

        for (int i = 2; i < n; i++) {
            int current = cost[i] + Math.min(prev1, prev2);
            prev2 = prev1;
            prev1 = current;
        }

        return Math.min(prev1, prev2);
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20}; // Sample input

        System.out.println("Min cost (DP array): " + minCostClimbingStairs(cost));
        System.out.println("Min cost (Optimized): " + minCostClimbingStairsOptimized(cost));
    }
}
