def containsNearbyDuplicate(nums: list[int], k: int) -> bool:
    window=set()
    for i in range(len(nums)):
        if nums[i] in window: return True #if we've seen this number before in the last k indices
        
        window.add(nums[i])
            
        if len(window)>k: window.remove(nums[i-k])
        
    return False