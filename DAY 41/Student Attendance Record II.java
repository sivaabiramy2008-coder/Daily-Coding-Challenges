class Solution {
    public int checkRecord(int n) {
        int MOD = 1000000007;
        long[][] dp = new long[2][3];
        dp[0][0] = 1;
        for (int day = 0; day < n; day++) {
            long[][] next = new long[2][3];
            for (int a = 0; a <= 1; a++) {
                for (int l = 0; l <= 2; l++) {
                    long count = dp[a][l];
                    if (count == 0) {
                        continue;
                    }
                    next[a][0] = (next[a][0] + count) % MOD;
                    if (a == 0) {
                        next[1][0] = (next[1][0] + count) % MOD;
                    }
                    if (l < 2) {
                        next[a][l + 1] =
                            (next[a][l + 1] + count) % MOD;
                    }
                }
            }
            dp = next;
        }
        long answer = 0;
        for (int a = 0; a <= 1; a++) {
            for (int l = 0; l <= 2; l++) {
                answer = (answer + dp[a][l]) % MOD;
            }
        }
        return (int) answer;
    }
}
