class Solution {
    public static String reverseString(String s) {
        StringBuilder t=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            t.append(c);
        }
        return t.toString();
    }
}