/*
 * @lc app=leetcode id=204 lang=java
 *
 * [204] Count Primes
 */
class Solution {
    public int countPrimes(int n) {
<<<<<<< HEAD
        if (n <= 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; j * i < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;


=======
        
>>>>>>> 6a6d81dc479e8370c039d44d3a1259aa4817c208
    }
}

