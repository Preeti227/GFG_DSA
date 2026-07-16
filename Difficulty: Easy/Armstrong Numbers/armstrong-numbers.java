class Solution {
    static boolean armstrongNumber(int n) {
        int m=n,sum=0;
        while(n>0){
            int r=n%10;
            sum+=r*r*r;
            n=n/10;
        }
        if(m==sum) return true;
        return false;
    }
}