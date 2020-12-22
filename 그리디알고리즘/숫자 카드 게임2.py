n,m = map(int,input().split())
result = 0
for i in range(n):
    data = list(map(int,input().split()))
    mv = 10001
    for j in data:
        mv = min(mv,j)
    result = max(result,mv)
print(result)