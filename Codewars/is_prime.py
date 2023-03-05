from math import sqrt, ceil


def is_prime(num):
    if num <= 1:
        return False
    else:
        x = [i for i in range(1, ceil(sqrt(num+1)))if num % i == 0]
        return len(x) == 1


"""
#works but too slow
def is_prime(num):
    x = []
    for dig in range(1, num+1):
        if (num % dig == 0):
            x.append(dig)
    return len(x) == 2

print(is_prime(1))  # F
print(is_prime(2))  # T
print(is_prime(3))  # T
print(is_prime(73))  # T

not mine:
import random

def even_odd(n):
    s, d = 0, n
    while d % 2 == 0:
          s += 1
          d >>= 1
    return s, d

def Miller_Rabin(a, p):
    s, d = even_odd(p-1)
    a = pow(a, d, p)
    if a == 1: return True
    for i in range(s):
        if a == p-1: return True
        a = pow(a, 2, p)
    return False

def is_prime(p):
    if p == 2: return True
    if p <= 1 or p % 2 == 0: return False
    return all(Miller_Rabin(random.randint(2,p-1),p) for _ in range(40))
##########################
import gmpy2

def is_prime(num):
  return gmpy2.is_prime(num) if num > 0 else False
##################
def is_prime(n):
  if  (n < 2) or (n > 2 and n%2 == 0):
      return False
  for i in range(3, int(n**.5)+1, 2):
      if n%i == 0:
          return False
  else:
      return True
"""