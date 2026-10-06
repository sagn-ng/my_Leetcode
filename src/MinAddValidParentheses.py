def minAddToMakeValid(s: str) -> int:
    no_Op, no_Cl=0, 0
    for c in s:
        if (c=='('): no_Cl+=1
        else:
            if (no_Cl!=0): no_Cl-=1
            else: no_Op+=1

    return no_Op+no_Cl

print(minAddToMakeValid("(((()()")) #ouput: 3