/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        if(head==null) return 0;
        if(head.next==null) return 1;
        int count=1;
        while(head.next!=null){
            head=head.next;
            count++;
        }
        return count;
    }
}