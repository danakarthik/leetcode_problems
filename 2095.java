class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)return null;
        if(head.next.next==null)
        {
            head.next=null;
            return head;
        }
        ListNode temp=head,tail=head;
        int size=0,middle_idx=0;

        while(tail!=null)
        {
            size++;
            tail=tail.next;
        }
        middle_idx=size/2;
        for(int i=0;i<middle_idx-1;i++)
        {
            temp=temp.next;
        }
        System.out.println(temp.val);
        temp.next=temp.next.next;
        System.out.println("middle index"+ middle_idx);
        return head;
    }
}
