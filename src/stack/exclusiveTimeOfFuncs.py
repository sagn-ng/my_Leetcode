def exclusiveTime(self, n: int, logs: list[str]) -> list[int]:
    idList=[0]*n

    store_id=[] #this stores the id of the functions being called (call stack)

    prev_time=0 #mark the previous timestamp to evaluate each function's operating time

    for func in logs:
        #first, get the function's id - the message - the timestamp
        tmp=func.split(':')
        func_id, cmd, t=int(tmp[0]), tmp[1], int(tmp[2])

        if (cmd=='start'):
            if (store_id):
            #runtime of the function that is on top of the stack
                idList[store_id[-1]]+=(t-prev_time)

            #if store_id (or 'call stack') is brand new, or just cleared,
            #we can only add it to the stack and set the new timestamp
            prev_time=t
            store_id.append(func_id)

        else:
            #since there's always at least a 'start' log before an 'end' one
            idList[store_id.pop()]+=(t-prev_time+1)

            #if the time of an 'end' log is k, then that function works
            #until the end of the k_th second
            prev_time=t+1

    return idList 
