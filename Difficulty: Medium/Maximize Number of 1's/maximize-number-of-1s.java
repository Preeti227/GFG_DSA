class Solution {
    public int maxOnes(int arr[], int k) {
        int l=0,r=0,maxlen=0,zeroes=0;
        while(r<arr.length){
            if(arr[r]==0) zeroes++;
            if(zeroes>k){
                if(arr[l]==0) zeroes--;
                l++;
            }
            if(zeroes<=k) 
            maxlen=Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}