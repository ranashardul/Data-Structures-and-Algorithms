import java.util.*;

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        // Step 1: Build adjacency list
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        // Step 2: DFS to count provinces
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(adj, visited, i);
                provinces++;
            }
        }

        return provinces;
    }

    private void dfs(List<List<Integer>> adj, boolean[] visited, int city) {
        visited[city] = true;

        for (int neighbor : adj.get(city)) {
            if (!visited[neighbor]) {
                dfs(adj, visited, neighbor);
            }
        }
    }
}
