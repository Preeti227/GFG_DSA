class Solution {
    public int decimalEquivalent(String s, int b) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int digit;
            if(c>='0' && c<='9') digit=c-'0';
            else{
                digit=c-'A'+10;
            }
            ans=ans*b+digit;
        }
        return ans;
    }
}