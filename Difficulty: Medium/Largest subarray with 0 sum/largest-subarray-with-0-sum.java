class Solution {
    int maxLength(int arr[]) {
          HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If sum from index 0 to i is 0
            if (sum == 0) {
                maxLen = i + 1;
            }

            // If same prefix sum already seen
            if (map.containsKey(sum)) {
                int len = i - map.get(sum);
                maxLen = Math.max(maxLen, len);
            } 
            else {
                // Store first occurrence only
                map.put(sum, i);
            }
        }

        return maxLen;
        
    }
}
