/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> toReturn = new ArrayList<>();
        permutations(toReturn, new ArrayList<Integer>(), nums, 0);
        return toReturn;
    }

    public void permutations(List<List<Integer>> total, List<Integer> temp, int[] nums, int start) {
        if (temp.size() == nums.length) {
            total.add(new ArrayList<Integer>(temp));
        }
        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
            permutations(total, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}

