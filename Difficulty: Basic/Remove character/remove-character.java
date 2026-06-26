class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        boolean[] present=new boolean[26];
        for(int i=0;i<str2.length();i++){
            char c=str2.charAt(i);
            present[c-'a']=true;
        }
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str1.length();i++){
            char c=str1.charAt(i);
            if((present[c-'a'])==false){
                s.append(c);
            }
        }
        return s.toString();
    }
}