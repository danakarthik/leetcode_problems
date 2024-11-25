class Solution {
    private int atMostK(int[] nums,int k)
    {
         int l=0,r=0,count=0;
        HashMap<Integer,Integer>hsh=new HashMap();
        while(r<nums.length)
        {
            if(!hsh.containsKey(nums[r]))hsh.put(nums[r],1);
            else hsh.put(nums[r],hsh.get(nums[r])+1);
            while(hsh.size()>k)
            {
                hsh.put(nums[l],hsh.get(nums[l])-1);
                if(hsh.get(nums[l])==0)hsh.remove(nums[l]);
                l++;
            }
            
                count+=r-l+1;
         
            r++;
        }
        return count;

    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atMostK(nums,k)-atMostK(nums,k-1);
    }
}
