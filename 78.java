class Solution {
    private void uniquesubsets(int idx,int[] nums,List<List<Integer>> ans,List<Integer> res)
    {
        if(idx==nums.length)
        {
            ans.add(new ArrayList(res));
            return;
        }
        res.add(nums[idx]);
        uniquesubsets(idx+1,nums,ans,res);
        res.remove(res.size()-1);
        uniquesubsets(idx+1,nums,ans,res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList();
        uniquesubsets(0,nums,ans,new ArrayList());
        return ans;
        
    }
}
