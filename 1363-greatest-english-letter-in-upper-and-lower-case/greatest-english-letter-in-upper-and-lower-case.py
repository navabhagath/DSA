class Solution:
    def greatestLetter(self, s: str) -> str:
        l = set(s)  # no need for list() before set
        ans = ''
        for i in s:
            if 'a' <= i <= 'z':  
                if i.upper() in l:
                    ans = max(ans, i.upper())
            elif 'A' <= i <= 'Z':  
                if i.lower() in l:
                    ans = max(ans, i)
        return ans
