/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */
class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> elems = new HashMap<>();
        for (int n : nums) {
            elems.put(n, elems.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int i : elems.keySet()) {
            if (buckets[elems.get(i)] == null) {
                ArrayList<Integer> toAdd = new ArrayList<Integer>();
                toAdd.add(i);
                buckets[elems.get(i)] = toAdd;
            } else {
                buckets[elems.get(i)].add(i);
            }
        }
        List<Integer> toReturn = new LinkedList<Integer>();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) continue;
            if (k == 0) break;
            ArrayList<Integer> temp = buckets[i];
            for (int j = 0; j < temp.size(); j++) {
                toReturn.add(temp.get(j));
                k--;
            }
        }
        return toReturn;
    }
}

