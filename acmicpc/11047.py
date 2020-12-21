n,k = map(int,input().split())
m = [int(input()) for _ in range(n)]
m.reverse()
count = 0
for j in m:
    if k // j != 0:
        count = count + (k//j)
        k = k%j
    else:
        continue


print(count)