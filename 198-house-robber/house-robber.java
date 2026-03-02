class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        return findMax(nums, n-1, dp);
    }

    private int findMax(int[] nums, int n, int[] dp){
        if(n==0) return nums[n];
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];

        int pick = nums[n] + findMax(nums, n-2, dp);
        int notpick = 0 + findMax(nums, n-1, dp);

        return dp[n] = Math.max(pick, notpick);
    }
}