class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int cnt = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(c);
            } else { // c == ')'
                if (st.isEmpty()) {
                    cnt++; // need one '('
                } else {
                    st.pop(); // matched pair
                }
            }
        }
        
        cnt += st.size();
        return cnt;
    }
}