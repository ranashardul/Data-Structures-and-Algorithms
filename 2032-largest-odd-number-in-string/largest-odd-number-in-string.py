class Solution:
    def largestOddNumber(self, num: str) -> str:
        l = len(num)
        if l==0:
            return ""

        for i in range(l-1,-1,-1):
            if int(num[i])%2 == 1:
                return num[:i+1]
        return ""