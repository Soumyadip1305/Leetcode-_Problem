class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);
        int[] dp = new int[n + 1];
        dp[n] = 0;
        dp[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int take = arr[i] + (i + 2 < n ? dp[i + 2] : 0);
            int nt = dp[i + 1];
            dp[i] = Math.max(nt, take);
        }
        return Math.max(dp[0], dp[1]);
    }
}