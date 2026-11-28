from collections import deque

class state:
    def __init__(self, row: int, col: int, val: int) -> None:
        self.row=row
        self.col=col
        self.val=val

def minCost(grid: list[list[int]])->int:
    ans=1000000000

    m, n=len(grid), len(grid[0])


    dx=[0, 1]
    dy=[1, 0]

    myQ=deque()
    myQ.append(state(0, 0, grid[0][0]))

    while (len(myQ)!=0):
        currState=myQ.popleft()

        if (currState.row==m-1 and currState.col==n-1): ans=min(ans, currState.val)

        for i in range(2):
            nextRow=currState.row+dy[i]
            nextCol=currState.col+dx[i]

            if (nextRow>=m or nextCol>=n): continue

            nextVal=currState.val^grid[nextRow][nextCol]

            myQ.append(state(nextRow, nextCol, nextVal))

    return ans