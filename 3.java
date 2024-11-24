class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxlen=0,count=0,l=0,r=0;
    int[] hash=new int[256];
    Arrays.fill(hash, -1);
     while(r<s.length())
     { 
        
        if(hash[s.charAt(r)]!=-1)
            {
                if(hash[s.charAt(r)]>=l)
                {
                l=hash[s.charAt(r)]+1;
                }
            }
        
        maxlen=Math.max(maxlen,r-l+1);
        hash[s.charAt(r)]=r;
        r++;
        
     }
     return maxlen;

    }
}
