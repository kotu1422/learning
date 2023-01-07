from math import factorial
from random import shuffle

def permutations(s):
    allperm = []
    letters = []
    for k in s:
        letters.append(k)
    total = factorial(len(s))
    while total>len(allperm):
        shuffle(letters)
        jon = "".join(letters)     
        if jon not in allperm:
            allperm.append(jon)
    
    uniqperm = set(allperm)
    return uniqperm

print(permutations("aabb"))

"""        
i=4    
s = "abcdef"
y = s[:i]+s[i+1]+s[i]+s[i+2:]
print(y)
"""



