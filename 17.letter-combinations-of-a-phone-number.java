/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */
class Solution {
    public List<String> letterCombinations(String digits) {
        String digitLetter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> combos = new ArrayList<String>();
        if (digits.length() == 0) {
            return combos;
        }
        combine(combos, digitLetter, "", digits);
        return combos;
    }
    public void combine(List<String> combos, String[] digitLetter, String soFar, String digitsLeft) {
        if (digitsLeft == "" || digitsLeft.length() == 0) {
            combos.add(soFar);
            return;
        }
        String possibles = digitLetter[digitsLeft.charAt(0) - '0'];
        for (int i = 0; i < possibles.length(); i++) {
            combine(combos, digitLetter, soFar + Character.toString(possibles.charAt(i)), digitsLeft.substring(1, digitsLeft.length()));
        }
    }
}