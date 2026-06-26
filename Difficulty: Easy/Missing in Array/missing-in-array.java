class Solution {
    int missingNum(int nums[]) {
        int n = nums.length + 1;

        long sum1 = 0;
        long sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }

        sum2 = (long)n * (n + 1) / 2;

        return (int)(sum2 - sum1);
    }
}