class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
            return null;
        ListNode current = head;
        ListNode temp = current;
        int l = size(head);
        int nthbeg = l-n;
        int count =0;
        if(n==l){
            head = head.next;
            return head;
        }else{
            while(current != null){
                count++;
                temp = temp.next;
                if(count ==nthbeg){
                    temp = temp.next;
                }
                current.next = temp;
                current = current.next;
            }
            return head;
        }
    }
    public int size(ListNode head) {
        ListNode temp2 = head;
        int count = 0;
        while (temp2 != null) {
            count++;
            temp2 = temp2.next;
        }
        return count;
    }
}