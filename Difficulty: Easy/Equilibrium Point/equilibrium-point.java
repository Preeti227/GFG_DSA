class Solution {
    public static int findEquilibrium(int arr[]) {
       int total=0,left=0,right=0;
       for(int n:arr){
           total+=n;
       }
       for(int i=0;i<arr.length;i++){
           right=total-left-arr[i];
           if(right==left) return i;
           left=left+arr[i];
       }
      return -1;
    }
}
