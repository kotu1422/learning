def array_diff(a, b):
    c = []
    for element in a:
        if element in b:
            continue
        else:
            c.append(element)
            continue
    return c

print(array_diff([1,2],[1]))
print(array_diff([1,2,2,2,3],[2]))
print(array_diff([1,2,3], [1, 2]))