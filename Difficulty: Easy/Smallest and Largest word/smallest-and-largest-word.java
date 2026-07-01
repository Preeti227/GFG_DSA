class Solution {
    public ArrayList<String> smallerAndLarge(String s) {
        String[] words=s.split("\\s+");
        ArrayList<String> ans=new ArrayList<>();
        String small=words[0];
        String large=words[0];
        for(int i=1;i<words.length;i++){
            if(words[i].length()<small.length()){
                small=words[i];
            }
            if(words[i].length()>=large.length()){
                large=words[i];
            }
        }
        ans.add(small);
        ans.add(large);
        return ans;
        
    }
}