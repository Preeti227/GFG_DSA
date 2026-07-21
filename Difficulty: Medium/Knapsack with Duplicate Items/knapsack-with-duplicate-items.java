class Solution {
    public int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for(int i = 1; i <= n; i++) {

            int currentValue = val[i - 1];
            int currentWeight = wt[i - 1];
            for(int w = 1; w <= capacity; w++) {

                // Option 1: Do not take current item
                dp[i][w] = dp[i - 1][w];

                // Option 2: Take current item (can repeat)
                if(currentWeight <= w) {

                    int takeValue = currentValue +dp[i][w - currentWeight];
                    dp[i][w] = Math.max(dp[i][w],takeValue);
                }
            }
        }
        return dp[n][capacity];
        
    }
}