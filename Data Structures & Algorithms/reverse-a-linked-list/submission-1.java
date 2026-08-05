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
    public ListNode reverseList(ListNode head) {


        if (head == null || head.next == null)
            return head;

        ListNode pichewala=head;
        ListNode curr=head.next;
        ListNode aagewala = head.next.next;
        
        while (aagewala!=null){
            curr.next =pichewala;
            pichewala=curr;
            curr=aagewala;
            aagewala=aagewala.next;
            
  }
//   head.next=null;
//   head=curr;

        curr.next = pichewala;   // reverse last link
        head.next = null;        // old head becomes last node
        head = curr; 





    return head;    
    }
}
