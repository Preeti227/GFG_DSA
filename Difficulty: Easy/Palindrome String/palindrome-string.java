class Solution {
    boolean isPalindrome(String s) {
        StringBuilder t=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            t.append(c);
        }
        if(s.equals(t.toString())) return true;
        else return false;
        
    }
}