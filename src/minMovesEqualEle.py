#suppose the target number is t, then the total number of moves to be made is:
# abs(t-a_i), for i from 0 to (n-1)
#so, t is the 'median' of nums, we need to find it then add up the total differences
def minMoves2(nums: list[int]) -> int:
    sorted_nums = sorted(nums)

    n = len(nums)
    t = 0
    if n % 2 != 0:
        t = sorted_nums[(n + 1) // 2 - 1]
    else:
        t = (sorted_nums[n // 2 - 1] + sorted_nums[n // 2]) // 2

    ans = 0
    for x in nums:
        ans += abs(t - x)

    return ans