def dailyTemperatures(temperatures: list[int]) -> list[int]:
    n=len(temperatures)
    res=[0]*n #by default, res[i]=0
    j=-1
    for i in range(n-2, -1, -1):
        j=i+1
        while (j<n and temperatures[i]>=temperatures[j]):
            if (res[j]==0): #if we're unable to find a day in the future
            #that is warmer than the i_th day
                j=n
                break
            j+=res[j] #jump to the day that is warmer than the j_th day
            
        if (j<n): res[i]=j-i

    return res

temperatures=[73,74,75,71,69,72,76,73]
print(dailyTemperatures(temperatures)) #output: [1, 1, 4, 2, 1, 1, 0, 0]