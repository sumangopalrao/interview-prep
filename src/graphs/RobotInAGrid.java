//Program to find the path from the start 0, 0 to end k, k where some cells cannot be entered.
//CTCI 8.2
//TODO:: Add the cache for DP.
package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RobotInAGrid {
	
	private static List<Cell> findPath(boolean[][] table) {
		ArrayList<Cell> path = new ArrayList<Cell>();
		HashSet<Cell> fail = new HashSet<Cell>();
		if(getPath(path, table, table.length-1, table[0].length-1, fail))
			return path;
		return null;
	}
	
	private static boolean getPath(ArrayList<Cell> path, boolean[][] table, int row, int col, HashSet<Cell> fail) {
		
		if(row < 0 || col < 0) {
			return false;
		}
		
		if(table[row][col] == false)
			return false;
		
		Cell value = new Cell(row, col);
		if(fail.contains(value))
			return false;
		
		boolean isStart = (row == 0 && col == 0) ? true : false;
		
		if(isStart || getPath(path, table, row, col-1, fail) || getPath(path, table, row-1, col, fail)) {
			path.add(value);
			return true;
		}
		
		fail.add(value);
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] table = new boolean[][]{{true, true, true, true}, {false, false, false, true}, {true, false, true, true}, {true, true, true, true}};
		List<Cell> out = findPath(table);
		out.forEach((v) -> System.out.println(v.x + "," + v.y));
	}
	
	private static class Cell {
		int x;
		int y;
		
		Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

}
