class Solution {
    Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }

    Node reverseBetween(int a, int b, Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node temp = dummy;
        for(int i = 1; i < a; i++) {// Move to node just before position a
            temp = temp.next;
        }
        Node tail1 = temp;
        Node head2 = temp.next;

        temp = head2;
        for(int i = a; i < b; i++) {// Move to position b
            temp = temp.next;
        }
        Node tail2 = temp;
        Node head3 = tail2.next;

        tail2.next = null;

        Node newHead2 = reverse(head2);

        tail1.next = newHead2;
        head2.next = head3;

        return dummy.next;
    }
}