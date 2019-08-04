/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */
class Solution {
    public int missingNumber(int[] nums) {
        final int n = nums.length;
        int total = (n * (n + 1))/2;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return total - sum;
    }
}

