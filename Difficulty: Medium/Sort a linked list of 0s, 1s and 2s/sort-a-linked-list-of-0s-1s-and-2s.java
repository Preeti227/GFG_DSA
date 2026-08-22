/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
        // Dummy nodes for three lists
        Node zeroDummy = new Node(-1);
        Node oneDummy = new Node(-1);
        Node twoDummy = new Node(-1);

        // Tails of three lists
        Node zero = zeroDummy;
        Node one = oneDummy;
        Node two = twoDummy;
        Node curr = head;

        while(curr != null) {

            if(curr.data == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if(curr.data == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Connect the three lists
        zero.next = (oneDummy.next != null) ? oneDummy.next : twoDummy.next;
        one.next = twoDummy.next;
        two.next = null;

        return zeroDummy.next;
    }
}
