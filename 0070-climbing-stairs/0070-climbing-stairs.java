class Solution {
    public int climbStairs(int n) {
         int prev2=1;
        int prev=1;
        for (int i = 2; i <=n; i++) {
            int curr= prev + prev2;
            prev2=prev;
            prev=curr;
        }
        //System.out.println(Arrays.toString(dp));
        return prev;
    }

    static int solve(int i, int n,int[]dp) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return dp[n]= 1;
        }
        if (dp[i]!=-1)return dp[i];

        return dp[i]= solve(i + 1, n,dp) + solve(i + 2, n,dp);
        }
}