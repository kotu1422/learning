def top_3_words(text):
    xx=""
    for char in text:
        if (char not in ".,!@#$%^&*()[]{\}/:;"):
            xx+=char
    listx = xx.split()
    setx = set(listx)
    top1=0
    top2=0
    top3=0
    tops=["A","A","A"]
    for element in setx:
        cur = listx.count(element)
        if cur>=top1:
            tops[2]=tops[1]
            tops[1]=tops[0]
            tops[0]=element.lower()
            top1 = cur
            continue
        elif top1>cur>=top2:
            tops[2]=tops[1]
            tops[1]=element.lower()
            top2=cur
            continue
        elif top2>cur>=top3:
            tops[2]=element.lower()
            top3=cur
            continue
        else:
            continue
    try:
        tops.remove("A")
        tops.remove("A")
        tops.remove("A")
    finally:
        return tops



print(top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"))
# => ["e", "ddd", "aa"]

"""Write a function that, given a string of text (possibly with punctuation and line-breaks), returns an array of the top-3 most occurring words, in descending order of the number of occurrences.

Assumptions:
A word is a string of letters (A to Z) optionally containing one or more apostrophes (') in ASCII.
Apostrophes can appear at the start, middle or end of a word ('abc, abc', 'abc', ab'c are all valid)
Any other characters (e.g. #, \, / , . ...) are not part of a word and should be treated as whitespace.
Matches should be case-insensitive, and the words in the result should be lowercased.
Ties may be broken arbitrarily.
If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned, or an empty array if a text contains no words.
Examples:
top_3_words("In a village of La Mancha, the name of which I have no desire to call to
mind, there lived not long since one of those gentlemen that keep a lance
in the lance-rack, an old buckler, a lean hack, and a greyhound for
coursing. An olla of rather more beef than mutton, a salad on most
nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
on Sundays, made away with three-quarters of his income.")
# => ["a", "of", "on"]

top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e")
# => ["e", "ddd", "aa"]

top_3_words("  //wont won't won't")
# => ["won't", "wont"]
Bonus points (not really, but just for fun):
Avoid creating an array whose memory footprint is roughly as big as the input text.
Avoid sorting the entire array of unique words."""



"""
    
Here is a function that should solve the problem you described:

Copy code
import re
from collections import Counter

def top_3_words(text):
    # Split the text into a list of words
    words = re.findall(r'\b[a-z\']+\b', text.lower())

    # Count the number of occurrences of each word
    word_counts = Counter(words)

    # Sort the words by number of occurrences in descending order
    sorted_words = sorted(word_counts, key=word_counts.get, reverse=True)

    # Return the top 3 words
    return sorted_words[:3]
    """