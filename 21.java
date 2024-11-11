class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>arr=new ArrayList();
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode dummy=new ListNode();
        ListNode dummyhead= dummy.next;
        ListNode tail=dummy;
        ListNode ref;
        while(t1!=null)
        {
            arr.add(t1.val);
            t1=t1.next;
        }
        while(t2!=null)
        {
            arr.add(t2.val);
            t2=t2.next;
        }
        Collections.sort(arr,Collections.reverseOrder());
        for(int val:arr)
      {
        ref=new ListNode(val);
        ref.next=dummyhead;
        dummyhead=ref;
       
      }
      return dummyhead;
        
        
    }
}
