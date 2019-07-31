/*
 * @lc app=leetcode id=274 lang=java
 *
 * [274] H-Index
 */
class Solution {
    public int hIndex(int[] citations) {
        final int N = citations.length;
        if (citations == null || N == 0) {
            return 0;
        }
        Arrays.sort(citations);
        for (int i = N - 1; i >= 0; i--) {
            int tempH = citations[i];
            int n = N-i;
            if (n-tempH < tempH && n-tempH > 0) {
                return tempH;
            }
        }
        return 0;
    }
}

