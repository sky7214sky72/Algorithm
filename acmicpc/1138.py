n = int(input())
a = list(map(int,input().split()))
b = [0]*n

for i in range(1,n+1):
    t = a[i-1]
    cnt = 0
    for j in range(n):
        if cnt == t and b[j] == 0:
            b[j] = i
            break
        elif b[j] ==0:
            cnt += 1

print(*b)

