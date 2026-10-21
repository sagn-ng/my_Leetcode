def minOperations(s: str) -> int:
    if sorted(s)==list(s): return 0

    n = len(s)
    if n <= 2:
        return -1

    mn = min(s)
    mx = max(s)

    if mn == s[0] or mx == s[-1]:
        return 1

    if mn not in s[:-1] and mx not in s[1:]:
        return 3

    return 2


s=input("")
print(minOperations(s))