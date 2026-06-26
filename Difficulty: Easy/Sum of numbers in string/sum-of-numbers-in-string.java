class Solution {
    public int findSum(String s) {
        int num=0,sum=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='0' && c<='9'){
                num=num*10+(c-'0');
            }
            else{//whenever a digit is encountered the num is added to the sum
                sum+=num;
                num=0;//num is made 0
            }
    }
     sum+=num;//for the case digits are at the end
     return sum;
}
}