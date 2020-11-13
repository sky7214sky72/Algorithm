n = int(input())
s = []
e = []

for i in range(n):
    si,ei = map(int,input().split())
    s.append(si)
    e.append(ei)

max_s = max(s)
min_s = min(e)

ans = max_s - min_s

if ans < 0:
    print(0)
else:
    print(ans)