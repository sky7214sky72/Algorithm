n,m = map(int,input().split())
result = 0

for i in range(n):
    a = list(map(int,input().split()))
    min_value = min(a)
    if result < min_value:
        result = min_value

print(result)


