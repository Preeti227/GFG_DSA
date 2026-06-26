class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:arr) ans.add(n);
        
        Collections.sort(ans,(a,b)->{
        int freqA=map.get(a);
        int freqB=map.get(b);
        if(freqA == freqB) {
            return a-b;
        }
        return freqB-freqA;
        });
        return ans;
    }
}