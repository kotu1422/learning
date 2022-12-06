def is_valid_walk(walk):
    # determine if walk is valid
    if walk.count("n")-walk.count("s") == walk.count("w")-walk.count("e") == 0 and walk.count("n")+walk.count("s")+walk.count("w")+walk.count("e") == 10:
        return True
    else:
        return False


print(is_valid_walk(['n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's']))
print(is_valid_walk(['w', 'e', 'w', 'e', 'w',
      'e', 'w', 'e', 'w', 'e', 'w', 'e']))
