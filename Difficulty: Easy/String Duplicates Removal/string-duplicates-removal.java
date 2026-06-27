class Solution {
    String removeDuplicates(String s) {
        boolean[] present=new boolean[256];
        StringBuilder t=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!present[c]){
                t.append(c);
                present[c]=true;
            }
        }
        return t.toString();
    }
}
