/*
 * @lc app=leetcode id=91 lang=java
 *
 * [91] Decode Ways
 * 
 * 1) The previous value is 0 and the current value is 0, we can't make progress, return 0. 
 * 2) The current value is 0, we have to use the previous value, if it is greater than 2, we can't make progress, return 0, otherwise we have to transition to this state from waysToDecode[i - 1]. 3) The previous value is 0, we can't use the previous, so the only way to transition to the current state is from the previous, so use waysToDecode[i]. 4) lastly, both previous and curr can be used so there are two ways to transition to the current state, thus at waysToDecode[i + 1] we can get here by using all the ways we can get to waysToDecode[i] + all the ways to get to waysToDecode[i - 1].
 */
class Solution {
    public int numDecodings(String s) {
        //either come in ones or pairs
        //12 -> 1 2 and 12
        //226 -> at i = 1... does
        //1934 -> 1...
        final int n = s.length();
        int[] nums = new int[n];
        if (n != 0) {
            nums[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            int toNum = Integer.parseInt(s.substring(i-1, i + 1));
            if (toNum < 27 && toNum > 0) {
                nums[i] += 1;
            }
        }
        return nums[n - 1] + 1;
    }

    public int convertToNum(char c) {
        return c - 'A' + 1;
    }
}

