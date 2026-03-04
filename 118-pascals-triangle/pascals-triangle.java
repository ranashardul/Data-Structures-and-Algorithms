class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0;j<=i; j++){
                int num = nCr(i,j);
                lst.add(num);
            }

            res.add(lst);
        }

        return res;
    }

    private int nCr(int n, int r){
        int result = 1;
        for(int i=0;i<r;i++){
            result = result * (n-i);
            result = result / (i+1);
        }

        return result;
    }
}