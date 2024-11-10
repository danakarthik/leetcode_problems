class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,ArrayList<Integer>>hsh=new HashMap();
        ArrayList<Integer>arr;
        boolean flag=false;
        for(int i=0;i<nums.length;i++)
        {
            if(!hsh.containsKey(nums[i]))
            {
                arr=new ArrayList();
                arr.add(i);
                hsh.put(nums[i],arr);
            }
            else
            {
                arr=new ArrayList();
                arr.add(i);
                hsh.get(nums[i]).addAll(arr);
                hsh.put(nums[i],hsh.get(nums[i]));
            }
        }
        
        for(Map.Entry<Integer,ArrayList<Integer>> entry:hsh.entrySet())
        {
            Integer key=entry.getKey();
            arr=entry.getValue();
            System.out.println("Key"+key +"  values"+arr);
            if(arr.size()>=2)
            {
                for(int i=0;i<arr.size();i++)
                {
                    for(int j=0;j<arr.size();j++)
                    {
                        if(i!=j)
                        {
                            System.out.println(arr.size());
                            System.out.println(arr.get(i)+" "+arr.get(j)+" "+Math.abs(arr.get(i)-arr.get(j)));
                            if(Math.abs(arr.get(i)-arr.get(j))<=k) 
                            flag=true;
                            break;
                            }
                    }
                }

            }

        }
        return flag;
        
    }
}
