class Solution {
    static int countDistinct(int arr[]) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:arr){
            set.add(n);
        }
        return set.size();
    }
}