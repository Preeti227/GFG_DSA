class Solution {
    public int minPlatform(int arr[], int dep[]) {
       Arrays.sort(arr);
       Arrays.sort(dep);
       int platforms=0,maxPlatforms=0;
       int i=0,j=0;
       while(i<arr.length && j<dep.length){
           if(arr[i]<=dep[j]){//when departure is later than arrival we need another platform
               platforms++;
               maxPlatforms=Math.max(platforms,maxPlatforms);
               i++;
           }
           else{
               platforms--;
               j++;
           }
       }
        return maxPlatforms;
    }
}
