class Solution {
    public int derangeCount(int n) {
        if(n<=2) return n-1;
        int prev2=0; //dp[1]
        int prev1=1;//dp[2]
        for(int i=3;i<=n;i++){
            int current =(i-1)*(prev2+prev1);
            prev2=prev1;
            prev1=current;
        }
       return prev1; 
    }
};