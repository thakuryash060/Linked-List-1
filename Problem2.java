class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int count = 0;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        while(count<=n){
            count++;
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;   
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}
