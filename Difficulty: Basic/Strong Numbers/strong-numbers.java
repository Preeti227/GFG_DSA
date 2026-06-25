class Solution {
    public boolean isStrong(int n) {
        int r=0,sum=0;
        int m=n;
        while(n>0){
            r=n%10;
            sum+=factorial(r);
            n=n/10;
        }
       if(sum==m) return true;
       else return false;
    }
    int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    
}