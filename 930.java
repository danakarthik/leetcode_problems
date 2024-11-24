class Solution {
    private int Subarraysgoal(int[] nums,int goal)
    {
        if(goal<0)return 0;
        int l=0,r=0,count=0,sum=0;
        while(r<nums.length)
        {
            sum+=nums[r];
            while(sum>goal&& l<nums.length)
            {
                if(nums[l]==1 )sum-=nums[l];
                l++;
            }
            if(sum<=goal)count+=r-l+1;
            r++;
        }
        return count;

    }
    public int numSubarraysWithSum(int[] nums, int goal) {
    
    return  Subarraysgoal(nums,goal)-Subarraysgoal(nums,goal-1);
        
    }
}
