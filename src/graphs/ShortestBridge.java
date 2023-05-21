package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestBridge {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] grid  = {
            {1, 1, 1, 1, 1},
            {1, 0, 0, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };
        
        System.out.println(shortestBridge(grid));
    }
    
    
    public static int shortestBridge(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, visited, i, j);
                    i = grid.length;
                    j = grid[0].length;
                }
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (visited[i][j]) {
                    queue.add(new int[] {i, j});
                }
            }
        }
        return bfs(grid, queue, visited);
        
    }

    public static int bfs(int[][] grid, Queue<int[]> queue, boolean[][] visited) {
        int distance = 0;

        int[][] dirs = {{-1, 0}, {1,0}, {0,-1}, {0,1}};

        while(!queue.isEmpty()) {
            int size = queue.size();

            for (int i=0; i<size; i++) {
                int[] curr = queue.poll();

                for (int[] dir : dirs) {
                    int newRow = curr[0] + dir[0];
                    int newCol = curr[1] + dir[1];

                    if (newRow < 0 || newRow >= grid.length || newCol < 0 || newCol >= grid[0].length || visited[newRow][newCol]) {
                        continue;
                    }
    
                    // If we've reached the second island, return the distance
                    if (grid[newRow][newCol] == 1) {
                        return distance;
                    }
                    
                    // Mark the cell as visited and add it to the queue
                    visited[newRow][newCol] = true;
                }
            }
            distance++;
        }

        return distance;
    }
    
    public static void dfs(int[][] grid, boolean[][] visited, int i, int j) {
        if(i >= grid.length || i < 0 || j<0 || j >= grid[0].length || visited[i][j] || grid[i][j] == 0) {
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i-1, j);
        dfs(grid, visited, i+1, j);
        dfs(grid, visited, i, j-1);
        dfs(grid, visited, i, j+1);
    }
}