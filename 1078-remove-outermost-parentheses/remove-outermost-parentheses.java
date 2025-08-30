class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        if(n==0) return ans.toString();

        for(int i=0; i<n; i++){
            if(s.charAt(i)==')'){
                cnt--;

                if(cnt > 0) ans.append(s.charAt(i));
            }

            if(s.charAt(i)=='('){
                cnt++;

                if(cnt>1) ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}