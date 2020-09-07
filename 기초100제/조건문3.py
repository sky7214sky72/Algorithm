# 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
a = int(input())
if a>0:
    print('plus')
elif a<0:
    print('minus')

if abs(a)%2==0:
    print('even')
elif abs(a)%2!=0:
    print('odd')