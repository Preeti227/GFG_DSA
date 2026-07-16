class Solution {
    public ArrayList<Integer> diffArray(int[] arr, int[][] opr) {
        int n=arr.length;
        int[] diff=new int[n+1];
        for(int[] operation:opr){
            int left=operation[0];
            int right=operation[1];
            int val=operation[2];
            diff[left]+=val;
            if(right+1<n){
                diff[right+1]-=val;
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        int currentUpdate=0;
        for(int i=0;i<n;i++){
            currentUpdate+=diff[i];
            ans.add(arr[i]+currentUpdate);
        }
        return ans;
    }
}
