class Solution {
    boolean twoSum(int nums[], int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=0;
            need=target-nums[i];
            if(map.containsKey(need)){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
        
    }
}