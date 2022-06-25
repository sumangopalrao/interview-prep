// Leetcode: Find if given 2x2 matrix of chars is a vaslid sudoku board
package arrays;

import java.util.*;

public class ValidSudoku {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','8','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i=0; i<9; i++) {
            Set<Character> currRowSet = new HashSet<Character>();
            for (int j=0; j<9; j++) {
                if (board[i][j] == '.') {
                    continue;
                } if (currRowSet.contains(board[i][j])) {
                    return false;
                } else {
                    currRowSet.add(board[i][j]);
                }
            }
        }

        for (int j=0; j<9; j++) {
            Set<Character> currColSet = new HashSet<Character>();
            for (int i=0; i<9; i++) {
                if (board[i][j] == '.') {
                    continue;
                } if (currColSet.contains(board[i][j])) {
                    return false;
                } else {
                    currColSet.add(board[i][j]);
                }
            }
        }

        Map<String, Set<Character>> squaresMap = new HashMap<>();

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                int row = i / 3;
                int col = j / 3;
                String tup = row + "" + col;
                Set<Character> sqrSet = squaresMap.get(tup);
                if (sqrSet != null) {
                    if (sqrSet.contains(board[i][j])) {
                        return false;
                    }
                } else {
                    sqrSet = new HashSet<Character>();
                    squaresMap.put(tup, sqrSet);
                }
                if (board[i][j] != '.')
                    sqrSet.add(board[i][j]);
            }
        }

        return true;
    }


}
