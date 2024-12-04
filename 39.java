class Solution {
    private void targetsumarray(int idx,int n,int[] arr, int target,int sum,List<Integer> list,List<List<Integer>>lis)
    {
       if (sum == target) {  
            lis.add(new ArrayList<>(list));  
            return;
        }
        if (sum > target || idx == n) { 
            return;
        }

        list.add(arr[idx]);
        targetsumarray(idx,n,arr,target,sum+arr[idx],list,lis);
        list.remove(list.size()-1);
        targetsumarray(idx+1,n,arr,target,sum,list,lis);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
          List<List<Integer>> lis=new ArrayList();
          targetsumarray(0,candidates.length,candidates,target,0,new ArrayList<>(),lis);
          return lis;

    }
}
