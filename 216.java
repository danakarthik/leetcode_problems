class Solution {
    private void valid_Combinations(int idx,int[] nums,int k,int sum,int tar,List<List<Integer>> ans,List<Integer> res)
    {
        if(idx==nums.length)
        {
            if(sum==tar && k==res.size())
            {
                ans.add(new ArrayList(res));
            }
            return;
        }
        res.add(nums[idx]);
        valid_Combinations(idx+1,nums,k,sum+nums[idx],tar,ans,res);
        res.remove(res.size()-1);
        valid_Combinations(idx+1,nums,k,sum,tar,ans,res);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums=new int[9];
        for(int i=0;i<9;i++)nums[i]=i+1;
        List<List<Integer>> ans=new ArrayList();
        valid_Combinations(0,nums, k,0, n,ans,new ArrayList());
        return ans;
        
    }
}
