class Solution {
    public void mergeArrays(int nums1[], int nums2[]) {
        int left=nums1.length-1;
        int right=0;
        while(left>=0 && right<nums2.length){
            if(nums1[left]>nums2[right]){
                swap(nums1,nums2,left,right);
                left--;
                right++;
            }
            else break;
            
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return;
    }
        void swap(int[] nums1,int[] nums2,int a,int b){
            int temp;
            temp=nums1[a];
            nums1[a]=nums2[b];
            nums2[b]=temp;
        }
}
        