def minimumSumSubarray(self, nums: list[int], l: int, r: int) -> int:
    n=len(nums)
    prefixSum=[0]*(n+1)

    for i in range(n): prefixSum[i+1]=prefixSum[i]+nums[i]

    ans=1000000

    for size in range(l, r+1):
        for t in range(0, n+1-size):
            sumRange=prefixSum[t+size]-prefixSum[t]

            if (sumRange>0 and sumRange<ans): ans=sumRange
        
    return -1 if (ans==1000000) else ans