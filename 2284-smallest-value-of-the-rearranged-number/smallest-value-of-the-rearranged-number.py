class Solution:
    def smallestNumber(self, num: int) -> int:
        if num>=0 and num<10:
            return num
        if num>0:
            num=list(str(num))
            s=sorted(list(set(num)))
            
            num.sort()
            if num[0]=='0':
                i=num.index(s[1])
                print(i,s)
                num[i],num[0]=num[0],num[i]
            print(num)
            num=int(''.join(num))
        else:
            num=list(str(num))
            num.pop(0)
            num.sort(reverse=True)
            num=int(''.join(num))
            num=num*-1
        return num