class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        dp[0] = nums[0];

        for(int i=1;i<n;i++){
            int take = nums[i];
            if(i>1) take = take + dp[i-2];
            int nottake = 0 + dp[i-1];

            dp[i] = Math.max(take, nottake);
        }

        return dp[n-1];
    }
}