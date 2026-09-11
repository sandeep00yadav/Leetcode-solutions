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
    public ListNode reverseKGroup(ListNode head, int k) {
       // check karo kay k element LinkList main hai 
       ListNode temp=head;
       for(int i=0;i<k;i++){
        if(temp==null){
        return head;
        }
       temp=temp.next;
       }
       // ab reverse kar do
       ListNode prev=null;
       ListNode curr=head;
       for(int i=0;i<k;i++){
        ListNode next=curr.next;// uss iteration ke baad wali value ko save kar late hai
        curr.next=prev;
        prev=curr;
        curr=next;
       }
       // purane head ko aage bache group  se connect kar do
       head.next=reverseKGroup(curr,k);
       return prev;
    }
}