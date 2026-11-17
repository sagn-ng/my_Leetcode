def carFleet(target: int, position: list[int], speed: list[int]) -> int:
    cars=sorted(zip(position, speed))
    stack=[]

    for pos, sp in cars:
        t=(target-pos)/sp

        while stack and t>=stack[-1]:
            #'merge' all the previous cars which might cause fleets
            stack.pop()

        stack.append(t)

    return len(stack)

#example from leetcode:
"""
target=12
position=[10,8,0,5,3]
speed=[2,4,1,1,3]
print(carFleet(target, position, speed)) #output: 3
"""