/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> toReturn = new ArrayList<>();
        backtrack(toReturn, new ArrayList<Integer>(), 0, nums);
        return toReturn;
    }
    public void backtrack(List<List<Integer>> toReturn, List<Integer> tempList, int start, int[] nums) {
        /* if (!toReturn.contains(tempList)) {
            toReturn.add(new ArrayList<Integer>(tempList));
        }
        This takes a long time. 
        */
        toReturn.add(new ArrayList<Integer>(tempList));
        for (int i = start; i < nums.length; i++) {
            //If there are duplicates, skip this iteration and go on to the next
            if(i > start && nums[i] == nums[i-1]) continue; 
            tempList.add(nums[i]);
            backtrack(toReturn, tempList, i + 1, nums);
            tempList.remove(tempList.size() - 1);
        }
    }
}

