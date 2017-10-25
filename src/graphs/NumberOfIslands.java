
package graphs;

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {{'1', '0', '1', '0', '0'},
						 {'1', '0', '1', '0', '0'},
						 {'1', '0', '0', '0', '0'},
			             {'0', '0', '0', '0', '0'}};
		System.out.println(numIslands(grid));
	}
	
	public static int numIslands(char[][] grid) {
		int count = 0;
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j] == '0') {
					visited[i][j] = true;
				}
				else {
					if(visited[i][j] == false) {
						dfs(grid, visited, i, j);
						count++;
					}
				}
			}
		}
		return count;
	}
	
	public static void dfs(char[][] grid, boolean[][] visited, int i, int j) {
		if(i >= grid.length || i < 0 || j<0 || j >= grid[0].length) {
			return;
		}
		if(grid[i][j] == '0') {
			visited[i][j] = true;
			return;
		}
		if(visited[i][j] == true) {
			return;
		}
		visited[i][j] = true;
		dfs(grid, visited, i, j-1);
		dfs(grid, visited, i-1, j);
		dfs(grid, visited, i+1, j);
		dfs(grid, visited, i, j+1);
	}

}
