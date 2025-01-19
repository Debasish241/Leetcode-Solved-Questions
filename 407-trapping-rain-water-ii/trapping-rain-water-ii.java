class Solution {
    public int trapRainWater(int[][] h) {
        int m = h.length, n = h[0].length;
        if (m < 3 || n < 3) return 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m - 1 || j == n - 1) {
                    pq.add(new int[]{i, j, h[i][j]});
                    visited[i][j] = true;
                }
            }
        }
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        int water = 0;
        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int x = top[0], y = top[1], height = top[2];
            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && !visited[nx][ny]) {
                    water += Math.max(0, height - h[nx][ny]);
                    pq.add(new int[]{nx, ny, Math.max(height, h[nx][ny])});
                    visited[nx][ny] = true;
                }
            }
        }
        return water;
    }

}