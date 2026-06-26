class Solution {
    String removeSpaces(String s) {
        int n=s.length();
       StringBuilder t=new StringBuilder();
       for(int i=0;i<n;i++){
           char c=s.charAt(i);
           if(c != ' '){
               t.append(c);
           }
       }
        return t.toString();
        
    }
}