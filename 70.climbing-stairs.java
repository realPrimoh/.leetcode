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
        /* DP array solution
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        fib[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n]; */

        int one_step_before = 2;
        int two_steps_before = 1;
        int all_ways = 0;
        
        for(int i=2; i<n; i++){
            all_ways = one_step_before + two_steps_before;
            two_steps_before = one_step_before;
            one_step_before = all_ways;
        }
        return all_ways;
    }
}

