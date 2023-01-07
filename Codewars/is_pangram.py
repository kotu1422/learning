import string

def is_pangram(s):
    for letter in string.ascii_lowercase:
        if (letter not in s) and (letter.upper() not in s):
            return False
        else:
            continue
    return True
