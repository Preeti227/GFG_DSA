/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public boolean search(Node root, int val) {
    if(root==null) return false;
     if(root.data==val) return true;
     else if(root.data>val) return search(root.left,val);
     else return search(root.right,val); 
    }
}