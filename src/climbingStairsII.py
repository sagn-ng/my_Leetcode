def climbStairs(n, costs: list[int]) -> int:
    INF = 1000000000
    prev3, prev2, prev1 = INF, INF, 0
    for i in range(1, n + 1):
        cur = min(prev1 + 1, prev2 + 4, prev3 + 9) + costs[i - 1]
        prev3, prev2, prev1 = prev2, prev1, cur

    return prev1

#example: taken from leetcode
#costs=[1,2,3,4]
#n=4
#print(climbStairs(n, costs))