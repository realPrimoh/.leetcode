import java.util.ArrayList;

/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */
class Solution {
    public void rotate(int[] nums, int k) {
        //brute force arraylist
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = nums.length - k; i < nums.length; i++) {
            n.add(nums[i]);
        }
        for (int j = nums.length - k; j < nums.length; j++) {
            nums[j] = nums[nums.length - k - j];
        }
        for (int m = 0; m < k; m++) {
            nums[m] = n.remove(0);
        }
    }
}

