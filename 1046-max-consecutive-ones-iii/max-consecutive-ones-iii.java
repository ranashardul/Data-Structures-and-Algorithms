class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen = 0, l=0, r=0, zero=0;
        while(r<nums.length){
            if(nums[r]==0) zero++;
            
            if(zero>k){
                if(nums[l]==0) zero--;
                l++;
            }

            if(zero<=k){
                int len = r-l+1;
                maxlen = Math.max(len,maxlen);
            }

            r++;
        }

        return maxlen;
    }
}