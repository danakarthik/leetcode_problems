class Solution:
    def isToeplitzMatrix(self, matrix: List[List[int]]) -> bool:
        for i in range(len(matrix)-1):
            i_i=i+1
            for j in range(len(matrix[0])-1):
                j_j=j+1
                if(matrix[i][j]!=matrix[i_i][j_j]):
                    return False
                 
        return True
        
