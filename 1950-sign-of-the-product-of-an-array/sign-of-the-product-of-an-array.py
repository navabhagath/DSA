class Solution:
    def arraySign(self, nums: List[int]) -> int:
        a=1
        for i in nums:
            a*=i
        if a>0:
            return 1
        elif a==0:
            return 0
        else:
            return -1