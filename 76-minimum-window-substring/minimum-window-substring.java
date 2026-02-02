class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if (n < m) return "";

        HashMap<Character, Integer> mpp = new HashMap<>();

        // frequency map of t
        for (int i = 0; i < m; i++) {
            char ch = t.charAt(i);
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }

        int l = 0, r = 0;
        int cnt = m;   // number of chars still needed
        int minLen = Integer.MAX_VALUE;
        int start = -1;

        while (r < n) {
            char ch = s.charAt(r);

            if (mpp.containsKey(ch)) {
                if (mpp.get(ch) > 0) {
                    cnt--;
                }
                mpp.put(ch, mpp.get(ch) - 1);
            }

            // try shrinking
            while (cnt == 0) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char chr = s.charAt(l);

                if (mpp.containsKey(chr)) {
                    mpp.put(chr, mpp.get(chr) + 1);
                    if (mpp.get(chr) > 0) {
                        cnt++;
                    }
                }
                l++;
            }
            r++;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}
