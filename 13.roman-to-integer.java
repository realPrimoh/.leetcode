/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romans = initMap();
        char[] str = s.toCharArray();
        int total = 0;
        for (int i  = 0; i < str.length; i++) {
            if (str[i] == 'I') {
                if (i + 1 != str.length) {
                    if (str[i + 1] == 'V' || str[i + 1] == 'X') {
                        total -= 2;
                    }
                }
            } else if (str[i] == 'X') {
                if (i + 1 != str.length) {
                    if (str[i + 1] == 'L' || str[i + 1] == 'C') {
                        total -= 20;
                    }
                }
            } else if (str[i] == 'C') {
                if (i + 1 != str.length) {
                    if (str[i + 1] == 'D' || str[i + 1] == 'M') {
                        total -= 200;
                    }
                }
            }
            total += romans.getOrDefault(str[i], 0);
        }
        return total;
    }
    public HashMap<Character, Integer> initMap() {
        HashMap<Character, Integer> pureRomans = new HashMap<>();
        pureRomans.put('I', 1);
        pureRomans.put('V', 5);
        pureRomans.put('X', 10);
        pureRomans.put('L', 50);
        pureRomans.put('C', 100);
        pureRomans.put('D', 500);
        pureRomans.put('M', 1000);
        return pureRomans;
    }
}

