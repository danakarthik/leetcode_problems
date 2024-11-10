class Solution {
    public List<List<Integer>> generate(int numRows) {
        //List<List<Integer>>arr=new List<List<Integer>>();
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i< numRows;i++) arr.add(new ArrayList());
        arr.get(0).add(1);
        for(int i=1;i<numRows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i) arr.get(i).add(1);
                else{
                    
                    arr.get(i).add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
                
            }
            
        }
        return arr;
        
    }
}
