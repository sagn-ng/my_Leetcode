def sumStr(s: str)->int:
    x=int(s)
    ans=0
    while (x>0):
        ans+=(x%10)
        x//=10

    return ans

def digitSum(s: str, k: int) -> str:
    while (len(s)>k):
        n=len(s)

        temp=""

        for i in range(0, n-n%k, k):
            temp=temp+str(sumStr(s[i : i+k]))

        if (n%k!=0): temp=temp+str(sumStr(s[n-n%k : ]))

        s=temp

    return s

#example from leetcode:
#s="11111222223"
#print(digitSum(s, 3)) #output: "135"