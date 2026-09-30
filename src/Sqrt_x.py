def mySqrt(x: int) -> int:
    left, right = 0, x
    while left <= right:
        mid = left+(right-left)//2
        if mid * mid < x:
            left = mid + 1
        elif mid * mid > x:
            right = mid -1
        else:
            return mid
            
    return right  

print(mySqrt(37)) #output: 6