/*
 * @lc app=leetcode id=31 lang=java
 *
 * [31] Next Permutation
 */
class Solution {
    public void nextPermutation(int[] nums) {
        int toSwap = -1;
        //From right to left, 
        //find out of place number that is less than nums on right
        for (int i = nums.length - 1; i >=0; i--) {
            if (i > 0) {
                if (nums[i-1] < nums[i]) {
                    toSwap = i-1;
                    break;
                }
            }
        }
        //if no number found, just sort the array
        if (toSwap == -1) {
            Arrays.sort(nums);
            return;
        } else {
            //else swap the num with the first num higher than it right to left
            for (int i = nums.length - 1; i >=0; i--) {
                if (nums[i] > nums[toSwap]) {
                    swap(nums, toSwap, i);
                    break;
                }
            }
            //now reverse all numbers to the right of the swapped number
            reverseSort(nums, toSwap + 1, nums.length - 1);

        }
    }

    public void reverseSort(int[] num, int start, int end){   
        if(start > end)
            return;
        for(int i = start;i <= (end+start)/2; i++)
            swap(num, i, start + end - i);
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

