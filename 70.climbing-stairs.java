/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }
}

