import java.util.LinkedList;
import java.util.Queue;

class P994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int[][] visited = grid;
        int freshoranges = 0;

        // Initialize the queue with rotten oranges and count fresh oranges.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                if (grid[i][j] == 1) {
                    freshoranges++;
                }
            }
        }

        // If there are no rotten oranges initially and fresh oranges exist, return -1.
        if (freshoranges == 0) {
            return 0;
        }
        if (q.isEmpty()) {
            return -1;
        }

        int minutes = -1;
        int[][] dirs = {{0, -1}, {-1, 0}, {0, 1}, {1, 0}};

        // Start the BFS process.
        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                int[] cell = q.poll();
                int x = cell[0];
                int y = cell[1];

                for (int[] dir : dirs) {
                    int i = x + dir[0];
                    int j = y + dir[1];
                    if (i >= 0 && i < m && j >= 0 && j < n && visited[i][j] == 1) {
                        visited[i][j] = 2;
                        freshoranges--;
                        q.offer(new int[]{i, j});
                    }
                }
            }
            minutes++;
        }

        // If all fresh oranges have rotted, return the number of minutes.
        if (freshoranges == 0) {
            return minutes;
        }

        return -1;
    }
}
