/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 * If division is allowed:
 * Take product of entire array once.
 * Divide by nums[i] for each output[i]
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums;
        }
        int[] startLeft = new int[nums.length];
        int[] startRight = new int[nums.length];
        int p = 1;
        for (int i = 0; i < startLeft.length; i++) {
            startLeft[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = startRight.length - 1; i >= 0; i--) {
            startRight[i] = p;
            p *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = startLeft[i] * startRight[i];
        }
        return nums;
    }
}

/* This is in O(1) space, but its less clear.

int products[nums.length];

// Get the products below the current index
p=1;
for(int i=0;i < nums.length;++i) {
  products[i]=p;
  p*=nums[i];
}

// Get the products above the curent index
p=1;
for(int i= nums.length-1;i >= 0;--i) {
  products[i]*=p;
  p*=nums[i];
}



 */

