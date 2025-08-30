class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r=0;
        int len = 0;

        HashMap<Character, Integer> mpp = new HashMap<Character, Integer>();
        while(r<n){
            if(mpp.containsKey(s.charAt(r))) {
                l = Math.max(mpp.get(s.charAt(r))+1, l);
            }

            mpp.put(s.charAt(r),r);
            len = Math.max(len, r-l+1);
            r++;
        }

        return len;
    }
}