def to_camel_case(text):
    x = 0
    finstring = ""
    for key in text:
        if (key == "-") or (key == "_"):
            x += 1
        elif x == 1:
            finstring += key.upper()
            x -= 1
        else:
            finstring += key
    return finstring

pruba = "coś_tam-nie_coś"

to_camel_case(pruba)