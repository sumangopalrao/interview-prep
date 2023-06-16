// Check if 2D points are in a straight line
// https://leetcode.com/problems/check-if-it-is-a-straight-line/description/

package math;

public class CheckIfPointsAreInAStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 2) {
            return true;
        }
        
        int diffy1 = coordinates[1][1] - coordinates[0][1];
        int diffx1 = coordinates[1][0] - coordinates[0][0];
        
        for(int i=2; i<coordinates.length; i++) {
            int diffy1new = coordinates[i][1] - coordinates[i-1][1];
            int diffx1new = coordinates[i][0] - coordinates[i-1][0];
            
            if (diffy1new * diffx1 != diffx1new * diffy1) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(checkStraightLine(new int[][]{{1, 2}, {3, 4}, {5, 6}}));
        System.out.println(checkStraightLine(new int[][]{{1, -1}, {3, 4}, {5, 6}}));
    }
}
