class Solution {
    public int countWords(String s) {
        boolean flag=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '||c=='\t'||c=='\n'){
                flag=false;
            }
            else{
                if(flag==false) count++;
                flag=true;//when a word will be encountered flag will be true;
            }
        }
        return count;
    }
}