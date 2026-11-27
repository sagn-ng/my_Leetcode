def trap(height: list[int]) -> int:
    if not height:
        return 0

    l, r = 0, len(height) - 1
    maxLeft, maxRight = height[l], height[r]
    ans = 0

    while l < r:
    #dont check l==r since at that point, all the left and right
    # columns would all have been passed through
        if maxLeft < maxRight:
            l += 1
            maxLeft = max(maxLeft, height[l])
            ans += maxLeft - height[l]

        else:
            r -= 1
            maxRight = max(maxRight, height[r])
            ans += maxRight - height[r]

    #Incrementing l or decrementing r to check if the 'next' column
    # is able to store any water or not

    return ans

#example:
height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
print(trap(height)) #output: 6