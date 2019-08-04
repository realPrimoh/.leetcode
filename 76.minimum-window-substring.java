/*
 * @lc app=leetcode id=76 lang=java
 *
 * [76] Minimum Window Substring
 */
class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        HashSet<Character> toFind = new HashSet<>();
        for (Character c : t.toCharArray()) {
            toFind.add(c);
        }
        int windowStart = 0;
        int windowLength = Integer.MAX_VALUE;
        int savedWindowStart = 0;
        int windowEnd = 0;
        HashSet<Character> finds = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (toFind.contains(s.charAt(i))) {
                if (finds.size() == 0) {
                    windowStart = i;
                }
                finds.add(s.charAt(i));
                if (i - windowStart + 1 >= windowLength) {
                    finds.clear();
                    windowStart = i;
                    finds.add(s.charAt(i));
                } else if (finds.size() == toFind.size()) {
                    if (i - windowStart + 1 < windowLength) {
                        windowLength = i - windowStart + 1;
                        savedWindowStart = windowStart;
                        windowEnd = i;
                    }
                    finds.clear();
                    windowStart = i;
                    finds.add(s.charAt(i));
                }
            }
        }
        return s.substring(savedWindowStart, windowEnd + 1);
    }
}

