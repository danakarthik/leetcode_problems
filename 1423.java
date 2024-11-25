class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=1,r=k,max=0,sum=0,right_sum=0,right_idx=cardPoints.length-1;
        for(int i=0;i<k;i++)sum+=cardPoints[i];
        max=sum;
        int maxsum=max;
        for(int i=k-1;i>=0;i--)
        {
            max=max-cardPoints[i];
            right_sum+=cardPoints[right_idx];
            System.out.println(max+right_sum);
            right_idx--;
            maxsum=Math.max(maxsum,max+right_sum);
        }
        return maxsum;
        
    }
}
