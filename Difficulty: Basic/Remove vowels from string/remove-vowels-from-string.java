class Solution {
    String removeVowels(String s) {
       int n=s.length();
       StringBuilder t=new StringBuilder();
       for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'){
               t.append(c);
           }
       }
        return t.toString();
    }
}