from math import gcd

#find the length of the maximum subarr 'arr' such that 'product(arr)'=gcd(arr)*lcm(arr)
#the equation holds if and only if gcd(arr)=1 <=> gcd(product(arr), a_i)=1 (a_i in arr)

def maxLength(self, nums: list[int]) -> int:
    if (len(nums)==2): return 2
    
    best, left, prod=2, 0, 1

    for right, x in enumerate(nums):
        while (gcd(prod, x)>1):
        #if it's at the start (left=0, prod=1, right=0), this loop gets skipped,
        #simply update 'prod' ('best' is still 2)
            prod//=nums[left]
            left+=1

        prod*=x
        best=max(best, right-left+1)

    return best