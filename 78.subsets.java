/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> toReturn = new ArrayList<>();
       Arrays.sort(nums);
       backtrack(toReturn, new ArrayList<Integer>(), nums, 0);
       return toReturn;
    }
    
    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<Integer>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

