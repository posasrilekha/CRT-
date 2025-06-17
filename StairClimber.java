public class StairClimber {

    // DP array version
    public static int countWaysDP(int n) {
        if (n <= 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    // Space optimized version
    public static int countWaysOptimized(int n) {
        if (n <= 1) return 1;
        int a = 1, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    public static void main(String[] args) {
        int n = 5;  // Example: number of stairs

        System.out.println("Number of ways to climb " + n + " stairs (DP array): " + countWaysDP(n));
        System.out.println("Number of ways to climb " + n + " stairs (Optimized): " + countWaysOptimized(n));
    }
}
