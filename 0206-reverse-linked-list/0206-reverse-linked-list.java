class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode nextNode = currNode.next; // store next node
            currNode.next = prevNode;          // reverse pointer
            prevNode = currNode;               // move prev forward
            currNode = nextNode;               // move curr forward
        }

        return prevNode; // new head of reversed list
    }
}
