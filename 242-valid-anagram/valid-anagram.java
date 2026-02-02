class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n!=m) return false;

        HashMap<Character, Integer> mpp = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(mpp.containsKey(ch)){
                mpp.put(ch, mpp.get(ch)+1);
            } else {
                mpp.put(ch,1);
            }
        }

        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            if(mpp.containsKey(ch)){
                int freq = mpp.get(ch);

                if(freq==0) return false;
                else {
                    mpp.put(ch, mpp.get(ch)-1);
                }
            } else {
                return false;
            }
        }

        return true;
    }
}