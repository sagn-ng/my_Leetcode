from TreeNode import TreeNode
from collections import deque

def levelOrderBottom(root: TreeNode | None) -> list[list[int]]:
    if (not root): return []

    ans=deque() #list() is also available but i chose deque() for better performance at "appendleft()"

    myQ=deque()
    myQ.append(root)

    while (myQ):
        currLv=[]
        count=len(myQ)

        while (count>0):
            node=myQ.popleft()
            currLv.append(node)

            if (node.left): myQ.append(node.left)
                
            if (node.right): myQ.append(node.right)

            count-=1
            
        ans.appendleft([node.val for node in currLv])

    return list(ans)