class Solution {
    private void recurpermutations(int idx,int[] nums,List<List<Integer>>ans)
    {
        if(idx==nums.length)
        {
            List<Integer>ds=new ArrayList();
            for(int i=0;i<nums.length;i++)
            {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList(ds));
            return ;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(idx,i,nums);
            recurpermutations(idx+1,nums,ans);
            swap(idx,i,nums);
        }
    }
    private void swap(int a,int b,int[] nums)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList();
        recurpermutations(0,nums,ans);
        return ans;
        
    }
}
