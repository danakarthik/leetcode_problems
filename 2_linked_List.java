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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode t1=l1;
        ListNode ta1=new ListNode();
        ListNode ta2=new ListNode();
        ta1.next=l1;
        ta2.next=l2;
        ListNode t2=l2;
        ListNode dummy=new ListNode();
        ListNode head=dummy;
        ListNode tail=dummy;

        String s="";
        int carry=0,num=0;
        while(t1!=null || t2!=null )
        {
            ListNode node;
            int value;
            
            if(t1==null)
            {
                value=t2.val+carry;
                t2=t2.next;
                ta2=ta2.next;
            }
            else if(t2==null)
            {
                
                value=t1.val+carry;
                System.out.println(value);
                t1=t1.next;
                ta1=ta1.next;
            }
            else 
            {
                value=t1.val+t2.val+carry;
                t1=t1.next;
                t2=t2.next;
                ta1=ta1.next;
                ta2=ta2.next;
            }
           if(value<=9)
           {
            System.out.println(value);
            node=new ListNode(value);
            carry=0;
            tail.next=node;
            tail=node;
           }
           else if(value>9)
           {
            System.out.println(value);
            s=Integer.toString(value);
            node =new ListNode(s.charAt(s.length()-1)-'0'  );
            carry=s.charAt(0)-'0';
            tail.next=node;
            tail=node;
           }    
    }
    System.out.println(ta1.val+" "+ta2.val);
    if(carry>=1&& (ta1.val+ta2.val)>9)
    {
        ListNode node =new ListNode(carry);
        tail.next=node;
        tail=node;
    }
    return head.next;
    }
}
