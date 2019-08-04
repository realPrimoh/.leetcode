/*
 * @lc app=leetcode id=485 lang=java
 *
 * [485] Max Consecutive Ones
 */
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                counter += 1;
            }
            if(nums[i] == 0)  {
                counter = 0;
            } else {
                max = Math.max(max, counter);
            }
        }
        return max;
    }
}

