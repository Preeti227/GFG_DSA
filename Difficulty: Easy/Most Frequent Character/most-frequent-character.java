class Solution {
    public char getMaxOccuringChar(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        int max=0;
        char ans=' ';
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        
            if(map.get(c)>max ||(map.get(c) == max && c<ans)){
                max=map.get(c);
                ans=c;
            }
        }
        return ans;
    }
}