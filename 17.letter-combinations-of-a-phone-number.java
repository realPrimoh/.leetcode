/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        String digitLetter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> combos = new ArrayList<String>();
        
        if (digits.length()==0) return combos;

        combos.add("");
        for (int i = 0; i < digits.length(); i++) {
            combos = combine(digitLetter[digits.charAt(i) - '0'], combos);
        }
        return combos;
    }
    public List<String> combine(String digit, List<String> currCombos) {
        List<String> newCombos = new ArrayList<>();
        for (int i = 0; i < digit.length(); i++) {
            for (String s : currCombos) {
                newCombos.add(s+digit.charAt(i));
            }
        }
        return newCombos;
    }
}