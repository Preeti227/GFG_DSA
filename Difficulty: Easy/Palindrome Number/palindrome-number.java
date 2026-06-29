class Solution {
    public boolean isPalindrome(int n) {
        n=Math.abs(n);//converting negative to pos
        int r=0,m=n,p=0;
        while(n>0){
            r=n%10;
            p=p*10+r;
            n=n/10;
        }
        if(m==p) return true;
        return false;
        
    }
}