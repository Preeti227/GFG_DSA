class Solution {
    public int binaryToDecimal(String b) {
       int decimal=0;
       for(int i=0;i<b.length();i++){
           char c=b.charAt(i);
           decimal=decimal*2+(c-'0');
       }
        return decimal;
    }
}