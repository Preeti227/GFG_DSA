class Solution {
    Node reverse(Node head) {
    Node temp=head;
    Node prev=null;
    while(temp!=null){
        Node front=temp.next;
        temp.next=prev; 
        prev=temp; 
        temp=front;
    }
    return prev;
    }
    public boolean isPalindrome(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        head2=reverse(head2);
        
        Node i=head;
        Node j=head2;
        while(i!=null && j!=null){
            if(i.data!=j.data) return false;
            i=i.next;
            j=j.next;
        }
        return true;
    }
}