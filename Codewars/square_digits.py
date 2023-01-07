def square_digits(num):
    result = ""
    for digit in str(num):
        x = int(digit)**2
        result += str(x)
    return int(result)

a = 9119

print(square_digits(a))

"""
def square_digits(num):
    return int(''.join(str(int(d)**2) for d in str(num)))
    """