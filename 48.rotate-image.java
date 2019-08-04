/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */
class Solution {
    public void rotate(int[][] matrix) {
<<<<<<< HEAD
        final int n = matrix.length;
        //first, flip up-down
        for (int i = 0; i < n/2; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[n - 1 - i];
            matrix[n - 1 - i] = temp;
        }
        //then flip diagonally
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                int temp = matrix[j][k];
                matrix[j][k] = matrix[k][j];
                matrix[k][j] = temp;
            }
        }
=======
        
>>>>>>> 6a6d81dc479e8370c039d44d3a1259aa4817c208
    }
}

