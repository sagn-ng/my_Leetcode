#a solution using two pointers;
#time complexity: O(n^2)
#space complexity: O(n) or O(1)
class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums=sorted(nums)
        n = len(nums)
        ans=[]

        for i in range(n-2): #a triplet contains 3 elements, so we need the other 2 for each i
            if (nums[i]>0): break
            
            if (i>0 and nums[i]==nums[i-1]): continue

            l, r = i+1, n-1

            while l < r: #not l <= r since we don't want the same index to appear twice
                total = nums[i] + nums[l] + nums[r]

                if (total>0): r-=1
                elif (total<0): l+=1
                else:
                    ans.append([ nums[i], nums[l], nums[r] ])
                    while (l < r and nums[l] == nums[l+1]): l+=1
                    while (l < r and nums[r] == nums[r-1]): r-=1

                    l+=1
                    r-=1
        
        return ans

#example
nums = [-1, 0, 1, 2, -1, -4]
obj=Solution()
ans=obj.threeSum(nums)
print(ans)