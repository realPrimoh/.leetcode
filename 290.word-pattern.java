import java.util.HashMap;

/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> patterns = new HashMap<>();
        int wordCount = 0;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                s.append(str.charAt(i));
            } else {
                System.out.println("word found" + s.toString());
                char temp = pattern.charAt(wordCount);
                if (!patterns.containsKey(temp)) {
                    patterns.put(temp, s.toString());
                } else {
                    if (!patterns.get(temp).equals(s.toString())) {
                        return false;
                    }
                }
                s = new StringBuilder();
                wordCount++;
            }
        }
        return true;
    }
}

