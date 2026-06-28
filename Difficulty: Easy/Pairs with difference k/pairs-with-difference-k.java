class Solution {
    int countPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int pairs=0;
        for(int m:map.keySet()){
            int rem1=m-k;//k=3, suppose m=5 so it finds 5-3=2 is present 
            int rem2=m+k;
            if(map.containsKey(rem1)) pairs+=map.get(m)*map.get(rem1);
            if(map.containsKey(rem2)) pairs+=map.get(m)*map.get(rem2);
        }
        pairs=pairs/2;
        return pairs;
    }
}