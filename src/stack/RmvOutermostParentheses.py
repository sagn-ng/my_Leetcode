def removeOuterParentheses(s: str) -> str:
    res, temp="", ""
    foundOuter=False
    storeBr=[]
    for c in s:
        if (c=='('):
            storeBr.append(c)
            if (not foundOuter):
                foundOuter=True
            else: temp=temp+'('

        else:
            storeBr.pop()
            if (len(storeBr)==0):
                foundOuter=False
                res=res+temp
                temp=""
            else:
                temp=temp+')'

    return res

s="(()())(())"
print(removeOuterParentheses(s)) #output: "()()()"