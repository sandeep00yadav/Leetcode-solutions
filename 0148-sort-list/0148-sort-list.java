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
     // merge two shorted LinkList
        public ListNode MergeTwoSortedList(ListNode List1,ListNode List2){
            ListNode dummy=new ListNode(-1);
            ListNode temp=dummy;
            while(List1!=null && List2!=null){
                if(List1.val<List2.val){
                    temp.next=List1;
                    List1=List1.next;
                }else{
                    temp.next=List2;
                    List2=List2.next;
                }
                temp=temp.next;
            }
            if(List1!=null){
                temp.next=List1;
            }else{
                temp.next=List2;
            }
            return dummy.next;
        }
        // Find middle of link List
        public ListNode Middle(ListNode head){
            if (head == null || head.next == null) {
            return head;
        }
            ListNode slow=head;
            ListNode fast=head.next;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
        // Sort LinkList
    public ListNode sortList(ListNode head) {
       if(head==null||head.next==null){
        return head;
       }
       ListNode Mid=Middle(head);
       ListNode Right=Mid.next;
       Mid.next=null;
       ListNode Left=head;
       Left=sortList(Left);
       Right=sortList(Right);
       return MergeTwoSortedList(Left,Right);
    }
}