class Solution {
    public ArrayList<Integer> intersection(int arr1[], int arr2[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] > arr2[j]) {
                j++;
            }
            else if (arr2[j] > arr1[i]) {
                i++;
            }
            else {
                if (ans.size() == 0 || ans.get(ans.size() - 1) != arr1[i]) {
                    ans.add(arr1[i]);
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}