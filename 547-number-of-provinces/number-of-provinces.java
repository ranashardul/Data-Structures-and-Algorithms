class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] vis = new boolean[n];
        int cnt = 0;

        for (int i =0; i<n;i++){
            if(!vis[i]){
                dfs(isConnected, vis, i);
                cnt++;
            }
        }

        return cnt;
    }

    private void dfs(int[][] isConnected, boolean[] vis, int city){
        vis[city]=true;

        for (int j=0; j<isConnected.length; j++){
            if(isConnected[city][j]==1 && !vis[j]){
                dfs(isConnected, vis, j);
            }
        }
    }
}