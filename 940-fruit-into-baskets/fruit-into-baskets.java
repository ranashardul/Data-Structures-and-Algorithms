class Solution {
    public int totalFruit(int[] arr) {
        int l=0, r=0, maxlen=0;
        Map<Integer, Integer> mpp = new HashMap<>();
        while(r<arr.length){
            mpp.put(arr[r], mpp.getOrDefault(arr[r],0)+1);

            if(mpp.size()>2){
                mpp.put(arr[l],mpp.get(arr[l])-1);
                if(mpp.get(arr[l])==0) mpp.remove(arr[l]);
                l++;
            }
            
            maxlen = Math.max(maxlen, r-l+1);
            r++;
        }

        return maxlen;
    }
}