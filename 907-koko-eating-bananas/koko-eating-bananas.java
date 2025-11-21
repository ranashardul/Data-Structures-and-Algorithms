class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n= piles.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, piles[i]);
        }

        int low = 1;
        int high = max;

        while(low<=high){
            int mid = (low+high)/2;

            int totalhours = totalhours(piles, mid);

            if(totalhours <= h) high = mid - 1;
            else low = mid + 1;
        }

        return  low;
    }

    public int totalhours(int[] arr, int hours){
        int totalhours = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            totalhours += Math.ceil((double)arr[i]/hours);
        }

        return totalhours;
    }
}