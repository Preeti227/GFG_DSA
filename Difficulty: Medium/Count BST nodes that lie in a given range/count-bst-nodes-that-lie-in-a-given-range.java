
class Solution {
    int getCount(Node root, int low, int high) {
       if (root == null) {
            return 0;
        }

        int count = 0;

        if (root.data >= low && root.data <= high) {
            count++;
        }

        count += getCount(root.left, low, high);
        count += getCount(root.right, low, high);

        return count;
        
    }
}