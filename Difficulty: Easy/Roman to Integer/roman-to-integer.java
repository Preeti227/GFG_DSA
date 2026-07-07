class Solution {
    public int romanToDecimal(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            if(map.get(c)<prev){
                ans-=map.get(c);
            }
            else{
                ans+=map.get(c);
            }
            prev=map.get(c);
        }
        return ans;
    }
}