
class Solution {
    Node reverseBetween(int left, int right, Node head) {
        ArrayList<Node> list = new ArrayList<>();
        Node temp = head;

        while(temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int i = left - 1;
        int j = right - 1;
        while(i < j) {
            Node t1 = list.get(i);
            Node t2 = list.get(j);
            list.set(i, t2);
            list.set(j, t1);
            i++;
            j--;
        }

        for(i = 0; i < list.size(); i++) {
            if(i == list.size() - 1)
                list.get(i).next = null;
            else
                list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }
}