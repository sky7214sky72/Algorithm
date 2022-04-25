n, m = map(int, input().split())
result = 0
for i in range(n):
    a = list(map(int, input().split()))
    minNum = min(a)
    if result < minNum:
        result = minNum

print(result)


