class Solution {
    public long maximumTotalDamage(int[] power) {
        Arrays.sort(power);

        long[] dp = new long[power.length];
        Arrays.fill(dp, -1);

        return helper(0, power, dp);
    }

    private long helper(int i, int[] power, long[] dp) {
        if (i >= power.length) return 0;

        if (dp[i] != -1) return dp[i];
        
        long currentPower = power[i];
        
        int groupEndIndex = i;
        while (groupEndIndex < power.length && power[groupEndIndex] == currentPower) {
            groupEndIndex++;
        }
        int count = groupEndIndex - i;
        long notTake = helper(groupEndIndex, power, dp);

        long take = currentPower * count;
        int nextValidIndex = groupEndIndex;
        while (nextValidIndex < power.length && power[nextValidIndex] <= currentPower + 2) {
            nextValidIndex++;
        }
        take += helper(nextValidIndex, power, dp);

        return dp[i] = Math.max(take, notTake);
    }
}