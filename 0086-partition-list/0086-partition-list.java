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
    public ListNode partition(ListNode head, int x) {
        ListNode leftTail=new ListNode(0);
        ListNode left=leftTail;
        ListNode rightTail=new ListNode(0);
        ListNode right=rightTail;

        while(head!=null){
            if(head.val<x){
                left.next=head;
                left=left.next;             
            }
            else 
            {
                right.next=head;
                right=right.next;
            }
            head=head.next;
        }
        right.next=null;
        left.next=rightTail.next;
        return leftTail.next;
        
    }
}