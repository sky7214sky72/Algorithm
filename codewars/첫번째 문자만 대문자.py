def to_jaden_case(string):
    return ' '.join(i.capitalize() for i in string.split(" "))

quote = "How can mirrors be real if our eyes aren't real"
print(to_jaden_case(quote))

for i in quote.split(" "):
    print(i)

