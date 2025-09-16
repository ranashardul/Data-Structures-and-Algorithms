class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int l=0, r=0, maxlen=0, maxf=0;
        Map<Character, Integer> mpp = new HashMap(26);

        while(r<n){
            char ch = s.charAt(r);
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);
            maxf = Math.max(maxf, mpp.get(ch));

            if(((r-l+1)-maxf)>k){
                char chr = s.charAt(l);
                mpp.put(chr, mpp.get(chr)-1);
                l++;
            } else {
                maxlen = Math.max(maxlen, (r-l+1));
            }

            r++;
        }

        return maxlen;
    }
}