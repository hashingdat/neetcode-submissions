class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int size=0;
        ListNode curr = head.next;
        ListNode prev=head;
        if(head==null){
           return null;
        }

        while (temp!=null){
            size++;
            temp=temp.next;
        }
                if(size==n){
            return head.next;
        }
        for(int i=1;i<size-n;i++){
            curr=curr.next;
            prev=prev.next;
             }
             prev.next=curr.next;
             curr.next=null;

        return head;
    }
    
}
