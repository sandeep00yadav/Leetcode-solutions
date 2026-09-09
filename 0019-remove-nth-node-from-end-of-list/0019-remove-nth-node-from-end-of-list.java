/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }                  // yaha tak hum length count kiye hai 
        if(count==n){
            return head.next;
        }                 // agar length nth node ke barabar aa jaye too 
        ListNode previous=head;
        for(int i=1;i<count-n;i++){
            previous=previous.next;
        }
        previous.next=previous.next.next;
        return head;
    }
}