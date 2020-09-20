# 부모님을 기다리던 영일이는 검정/흰 색 바둑알을 바둑판에 꽉 채워 깔아 놓고 놀다가...
#
# "십(+)자 뒤집기를 해볼까?"하고 생각했다.
#
# 바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
# n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.

baduk = [[0 for j in range(20)] for i in range(20)]
for k in range(19):
    x=list(map(int,(input().split())))
    for l in range(19):
        baduk[k+1][l+1]=x[l]

a = int(input())
for v in range(a):
    v1,v2=map(int,(input().split()))
    for m in range(1,20):
        if baduk[v1][m]==0:
            baduk[v1][m]=1
        else:
            baduk[v1][m]=0
        if baduk[m][v2]==0:
            baduk[m][v2]=1
        else:
            baduk[m][v2]=0

for o in range(1,20):
    for p in range(1,20):
        print(baduk[o][p],end=' ')
    print('')