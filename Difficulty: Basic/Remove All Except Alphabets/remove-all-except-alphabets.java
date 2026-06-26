class Solution {
    public String removeChars(String s) {
        StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                t.append(c);
            }
        }
        return t.toString();
    }
};