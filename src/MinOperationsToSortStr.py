def minOperations(s: str) -> int:
    n=len(s)
    isSorted=True
    mn, mx=s[0], s[0]

    for i in range(1, n):
        if (s[i]<s[i-1]): isSorted=False

        if (s[i]<mn): mn=s[i]
        if (s[i]>mx): mx=s[i]

    if (isSorted): return 0
    if n==2: return -1

    if (mn==s[0] or mx==s[-1]): return 1

    for i in range(1, n-1):
        if (s[i]==mn or s[i]==mx): return 2

    return 3


s=input("")
print(minOperations(s))