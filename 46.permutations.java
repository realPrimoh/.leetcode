/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> toReturn = new ArrayList<>();
        permute(nums.length, new ArrayList<Integer>() {{ for (int i : nums) add(i); }}, toReturn, new ArrayList<Integer>());
        return toReturn;
    }

    public void permute(int len, ArrayList<Integer> nums, List<List<Integer>> total, List<Integer> tempList) {
        if (tempList.size() == len) {
            total.add(new ArrayList<Integer>(tempList));
        }
        for (int i = 0; i < nums.size(); i++) {
            tempList.add(nums.get(i));
            int temp = nums.get(i);
            nums.remove(i);
            permute(len, new ArrayList<Integer>(nums), total, tempList);
            tempList.remove(tempList.size() - 1);
            nums.add(i, temp);
        }
    }
}

