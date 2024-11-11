
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        if(head.next==null)
        {
            head=null;
            return head;
        }
       
        ListNode t=head,t1=head,prev;
        prev=new ListNode();
        ListNode dummy=prev;
        prev.next=head;
        String s="";
        while(t!=null)
        {
            size+=1;
            t=t.next;
        }
        System.out.println(size);
        int k=size-n;
         System.out.println("new idx"+k);
        if(k==0)
        {
            prev.next=head.next;
        }
        if(size>=3)
        for(int i=0;i<(size-n-1);i++)
        {
            t1=t1.next;
        }
        System.out.println(t1.val);
        if(t1.next.next==null)
        {
            t1.next=null;
        }
        else{
            t1.next=t1.next.next;
        }
        
        
        return dummy.next;
    }
}
