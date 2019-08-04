/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        SudokuChecker obj = new SudokuChecker();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!obj.add(i, j, board[i][j] - '0')) {
                        return false;
                    }
                } 
            }
        }
        return true;
    }

    public class SudokuChecker {
        ArrayList<HashSet<Integer>> boxes;
        ArrayList<HashSet<Integer>> rows;
        ArrayList<HashSet<Integer>> columns;
        public SudokuChecker() {
            boxes = new ArrayList<>();
            rows = new ArrayList<>();
            columns = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                boxes.add(new HashSet<Integer>());
                rows.add(new HashSet<Integer>());
                columns.add(new HashSet<Integer>());
            }
            
        }

        public int getBoxNumber(int row, int column) {
            if (row < 3) {
                if (column < 3) {
                    return 0;
                } else if (column < 6) {
                    return 1;
                } else {
                    return 2;
                }
            } else if (row < 6) {
                if (column < 3) {
                    return 3;
                } else if (column < 6) {
                    return 4;
                } else {
                    return 5;
                }
            } else if (row < 9) {
                if (column < 3) {
                    return 6;
                } else if (column < 6) {
                    return 7;
                } else {
                    return 8;
                }
            }
            return 9;
        }

        //Returns true if number is added for the first time.
        //Returns false if number already exists.
        public boolean add(int row, int column, int num) {
            if (row >= 9 || num > 9 || row < 0 || num < 0 || column >= 9 || column < 0) {
                return true;
            }
            int boxNumber = getBoxNumber(row, column);
            if (boxNumber != 9) {
                if (!(boxes.get(boxNumber).add(num))) {
                    return false;
                }
            } else {
                return false;
            }
            if (!columns.get(column).add(num)) {
                return false;
            }
            return rows.get(row).add(num);
        }
    }
}

