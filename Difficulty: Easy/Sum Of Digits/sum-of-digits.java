class Solution {
    static int sumOfDigits(int n) {
        int r=0,sum=0;
        while(n>0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
}
