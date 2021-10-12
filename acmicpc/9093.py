t = int(input())
sentence = []
for i in range(t):
    sentence = list(input().split())
    for j in sentence:
        print(j[::-1], end=" ")