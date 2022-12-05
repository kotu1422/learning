board = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
win = row1 = row2 = row3 = col1 = col2 = col3 = dia1 = dia2 = 2137


def check():
    row1 = board[0] == board[1] == board[2] != ' '
    row2 = board[3] == board[4] == board[5] != ' '
    row3 = board[6] == board[7] == board[8] != ' '
    col1 = board[0] == board[3] == board[6] != ' '
    col2 = board[1] == board[4] == board[7] != ' '
    col3 = board[2] == board[5] == board[8] != ' '
    dia1 = board[0] == board[4] == board[8] != ' '
    dia2 = board[2] == board[4] == board[6] != ' '
    win = row1 == row2 == row3 == col1 == col2 == col3 == dia1 == dia2 == 0
    return win


def display():
    print("Kolumny:  1.  2.  3.")
    print("Rząd 1. [", board[0], "|", board[1], "|", board[2], "]",)
    print("Rząd 2. [", board[3], "|", board[4], "|", board[5], "]",)
    print("Rząd 3. [", board[6], "|", board[7], "|", board[8], "]",)


def game():
    p1 = str(input("P1 NAME: "))
    p2 = str(input("P2 NAME: "))
    p1 = p1+" (O)"
    p2 = p2+" (X)"
    gracz = [p1, p2]
    k = i = 0
    display()
    while (True):
        print("Kolej ", gracz[k])
        x = int(input("rząd? (1/2/3)"))
        if x not in range(1, 4):
            print("jeszcze raz, od 1 do 3")
            continue
        else:
            y = int(input("kolumna? (1/2/3)"))
        if y not in range(1, 4):
            print("jeszcze raz, od 1 do 3")
            continue
        else:
            z = y-1+(x-1)*3
        if board[z] != " ":
            print("Zajęte")
            continue
        else:
            if k == 0:
                board[z] = "O"
                display()
                k += 1
            else:
                board[z] = "X"
                display()
                k -= 1
        i += 1
        t = check()
        if t == False:
            print(gracz[k], " przegrał")
            board = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
            break
        elif i == 9:
            print("REMIS")
            board = [' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ']
            break
        else:
            continue
