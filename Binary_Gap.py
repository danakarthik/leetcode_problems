class Solution:
    def binaryGap(self, n: int) -> int:
        s=str("{0:b}".format(int(n)))
        count=0
        
        for i in range(len(s)):
            c=0
            if(s[i]=='1'):
                for j in range(i+1,len(s)):
                    c+=1
                    if(s[j]=='1'):
                        break
                    if(j==len(s)-1):
                        c=0
            if(c>count):
                count=c
        return count
