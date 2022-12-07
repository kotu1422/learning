"""def find_uniq(arr):
    for n in arr:
        if arr.count(n) == 1:  
            return n   # n: unique number in the array
"""
from numpy import mean


def find_uniq(arr):
    if max(arr)-mean(arr) > mean(arr)-min(arr):
        return max(arr)
    else:
        return min(arr)

    """not mine:
    
    def find_uniq(arr):
    return [x for x in set(arr) if arr.count(x) == 1][0]
    
    def find_uniq(arr):
        return min(set(arr),key=arr.count)
        
    def find_uniq(arr):
    a = sorted(arr)
    return a[0] if a[0] != a[1] else a[-1]    
    """
