/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */
class Solution {
    HashSet<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else {
            if (seen.contains(n)) {
                return false; //if an integer has been seen before, it's an infinite loop
            }
            seen.add(n);
            int newnum = 0;
            while (n != 0) {
                newnum += Math.pow(n % 10, 2);
                n /= 10;
            }
            return isHappy(newnum);
        }
    }
}

