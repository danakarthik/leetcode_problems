import java.util.*;
public class MyClass {
    public static void print(int idx,int n, int sum,int[] arr, List<Integer>list,int k)
    {
        if(idx==n)
        {
            if(sum==k)
            {
                for(int ele:list)System.out.print(ele+" ");
                System.out.println();
            }
            
            return ;
            
        }
        list.add(arr[idx]);
        print(idx+1,n,sum+arr[idx],arr,list,k);
        list.remove(list.size()-1);
        print(idx+1,n,sum,arr,list,k);
        
        
    }
  public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      List<Integer>list=new ArrayList();
      System.out.print("enter n : ");
      int n=in.nextInt();
      int[] arr=new int[n];
      System.out.print("enter arr : ");
      for(int i=0;i<n;i++)arr[i]=in.nextInt();
      System.out.print("enter k : ");
      int k=in.nextInt();
      print(0,arr.length,0,arr,list,k);
  }
}
