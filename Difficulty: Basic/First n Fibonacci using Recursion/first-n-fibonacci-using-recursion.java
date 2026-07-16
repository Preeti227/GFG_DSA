class Solution {
    // Function to return list containing first n fibonacci numbers.
    public static int[] fibonacciNumbers(int n) {
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=fibo(i);
        }
        return ans;
        
    }
    static int fibo(int n){
        if(n==0||n==1) return n;
        return fibo(n-1)+fibo(n-2);
    }
}