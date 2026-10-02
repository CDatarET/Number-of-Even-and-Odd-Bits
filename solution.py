class Solution:
    def evenOddBit(self, n: int) -> list[int]:
        i = 0
        ret = [0, 0]
        while n > 0:
            if n % 2 == 1:
                if i % 2 == 0:
                    ret[0] += 1
                else:
                    ret[1] += 1
            
            i += 1
            n //= 2
        
        return ret
