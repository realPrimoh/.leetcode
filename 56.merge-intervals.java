/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

 /* Test Case:

'[[0, 0]]'

'[[1, 4], [1, 3]]' -> [[1, 4]]

 */

//Commented method uses a Queue, and then converts to int array
//This method uses int array from the beginning and resizes at end
class Solution {
    public int[][] merge(int[][] intervals) {
        sortIntervals(intervals);
        int pointer = 0;
        //LinkedList<int[]> queue = new LinkedList<>();
        int[][] result = new int[intervals.length][2];
        int counter = 0;
        while (pointer <= intervals.length - 1) {
            if (pointer + 1 < intervals.length) {
                if (intervals[pointer][1] >= intervals[pointer + 1][0]) {
                    intervals[pointer + 1][0] = intervals[pointer][0];
                    intervals[pointer + 1][1] = Math.max(intervals[pointer][1], intervals[pointer + 1][1]);
                } else {
                    //queue.add(intervals[pointer]);
                    result[counter] = intervals[pointer];
                    counter++;
                }
            } else {
                //queue.add(intervals[pointer]);
                result[counter] = intervals[pointer];
                counter++;
            }
            pointer += 1;
        }
        /*
        int[][] toReturn = new int[queue.size()][];
        for (int i = 0; i < toReturn.length; i++) {
            toReturn[i] = queue.poll();
        } */
        return Arrays.copyOf(result, counter);
    }

    public static void sortIntervals(int[][] oldIntervals) {
        //Java 8 Syntax
        Arrays.sort(oldIntervals, (int[] o1, int[] o2) -> o1[0] - o2[0]);

        //Java 7 Syntax uses formal Comparators
        /*Arrays.sort(oldIntervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            } */
    };

}

