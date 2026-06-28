
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        for(int num:b){
            if(!map.containsKey(num)||map.get(num)==0) return false;
            map.put(num,map.get(num)-1);
        }
        return true;
        
    }
}
