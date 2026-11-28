def longestConsecutive(nums: list[int]) -> int:
    numsSet=set(nums)
    ans=0

    for x in numsSet:
        if x-1 in numsSet: continue

        currCount=1
        while (x+currCount in numsSet):
            currCount+=1

        ans=max(ans, currCount)

    return ans

#example:
#print(longestConsecutive([0,3,7,2,5,8,4,6,0,1])) #output: 9