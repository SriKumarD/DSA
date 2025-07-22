// User function Template for Java

class Solution {
    static long modMultiply(long a, long b) {
        // Use modular multiplication with modulus 10^9 + 7
        long MOD = 1000000007;
        return (a % MOD * b % MOD) % MOD;
    }
}
