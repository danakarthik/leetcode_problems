def count(i, s):
    j = i
    c = 0
    while j < len(s) and s[i] == s[j]:
        c += 1
        j += 1
    return c, i, j

def count_letter(s):
    result = ""
    i = 0
    while i < len(s):
        c, k, j = count(i, s)
        result += str(c) + s[k]  # Append count and character to result
        i = j  # Move to the next new character
    return result
s='1'
n=int(input("enter your limit: "))
for i in range(1,n):
    s=count_letter(s)
print(s)

'''
test cases are :
n:  output:
1---1
2---11
3---21
4---1211
5---111221
6---312211
7---13112221
8---1113213211
9---31131211131221'''
