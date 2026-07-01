class Solution {
    public String sortString(String s) {
       int[] freq=new int[26];
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           freq[c-'a']++;
       }
       for(int i=0;i<26;i++){
           while(freq[i]>0){
               ans.append((char)(i+'a'));
               freq[i]--;
           }
       }
        return ans.toString();
        
    }
}