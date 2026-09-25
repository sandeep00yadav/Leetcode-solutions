class Solution {
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode far=curr.next;
            curr.next=prev;
            prev=curr;
            curr=far;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1;i<left;i++){
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=temp.next;
        for(int i=left;i<=right;i++){
         temp=temp.next;
        }
        ListNode tail2=temp;
        ListNode head3=temp.next;
        tail1.next=null;
        tail2.next=null;
        ListNode newHead=reverse(head2);
        tail1.next=newHead;
        head2.next=head3;
        return dummy.next;
    }
}