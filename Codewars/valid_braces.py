def valid_braces(string):
    open = []
    for bracket in string:
        if bracket == "(":
            open.append("R")
        elif bracket == "[":
            open.append("S")
        elif bracket == "{":
            open.append("C")
        elif bracket == ")"  and len(open) > 0:
            if open[-1] == "R":
                open.pop()
        elif bracket == "]" and len(open) > 0:
            if open[-1] == "S":
                open.pop()
        elif bracket == "}" and len(open) > 0:
            if open[-1] == "C":
                open.pop()
        else:
            break
    if len(open) == 0:
        return True
    else:
        return False


""""(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False"""

print(valid_braces("(){}[]"))
print(valid_braces("([{}])"))
print(valid_braces("(}"))
print(valid_braces("[(])"))
print(valid_braces("[({})](]"))
