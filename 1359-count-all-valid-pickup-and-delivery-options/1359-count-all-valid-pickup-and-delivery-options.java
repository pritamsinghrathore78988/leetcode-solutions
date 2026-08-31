class Solution {
    public int countOrders(int n) {
        long MOD = 1_000_000_007L;
        long ans = 1;

        for (int i = 1; i <= n; i++) {
            ans = (ans * i) % MOD;
            ans = (ans * (2L * i - 1)) % MOD;
        }

        return (int) ans;
    }
}
