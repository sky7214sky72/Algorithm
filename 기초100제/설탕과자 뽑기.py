# 격자판의 세로(h), 가로(w), 막대의 개수(n), 각 막대의 길이(l),
# 막대를 놓는 방향(d:가로는 0, 세로는 1)과
# 막대를 놓는 막대의 가장 왼쪽 또는 위쪽의 위치(x, y)가 주어질 때,
#
# 격자판을 채운 막대의 모양을 출력하는 프로그램을 만들어보자.

h,w=map(int,(input().split()))
a=[[0 for j in range(w+1)]for i in range(h+1)]
n=int(input())
for k in range(n):
    l,d,x,y=map(int,(input().split()))
    for m in range(l):
        if d==0:
            a[x][y+m]=1
        else:
            a[x+m][y]=1

for o in range(1,h+1):
    for p in range(1,w+1):
        print(a[o][p],end=' ')
    print('')