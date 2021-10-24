#문자열에서 모음만 제거하는 문제
def disemvowel(string_):
    vowel = "aeiouAEIOU"
    string_ = ''.join( x for x in string_ if x not in vowel)
    return string_

print(disemvowel("This website is for losers LOL!"))