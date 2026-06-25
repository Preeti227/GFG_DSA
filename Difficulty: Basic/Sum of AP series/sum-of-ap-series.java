class Solution {
    public int sumOfAP(int n, int a, int d) {
        int sum=0;
        int ap=0;
        for(int i=0;i<n;i++){
            ap=a+(i*d);
            sum=sum+ap;
        }
        return sum;
        
    }
};