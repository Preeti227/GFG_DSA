class Solution {
    static void rotateArr(int nums[], int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=nums[i];            
        }
        for(int i=k;i<n;i++){
            nums[i-k]=nums[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            nums[i]=temp[j];
            j++;
        }
        return;
        
    }
}