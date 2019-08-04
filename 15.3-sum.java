/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> toReturn = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int[] temp = new int[] {nums[i], nums[j], nums[k]};
                        Arrays.sort(temp);
                        if (!toReturn.contains(Arrays.asList(temp))) {
                            toReturn.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[k])));
                        }
                    }
                }
            }
        }
        return toReturn;
    }
}

