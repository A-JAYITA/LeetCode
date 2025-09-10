class Solution {
    public int climbStairs(int n) {
        int prev1 = 1, prev2 = 1, ans = 1;
        for(int i = 2; i <= n; i++) {
            ans = prev1 + prev2;
            prev2 = prev1;
            prev1 = ans;
        }
        return ans;
    }
}