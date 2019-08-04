/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] toReturn = new int[] {-1, -1};
        final int n = nums.length;
        if (nums == null || n == 0) {
            return toReturn;
        }
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (nums[start] == target) {
            toReturn[0] = start;
        } else {
            return toReturn;
        }
        end = n - 1;
        while (start < end) {
            int mid = (start + end)/2 + 1;
            if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid;
            }
        } 
        toReturn[1] = end;
        return toReturn;
        
    }
}

