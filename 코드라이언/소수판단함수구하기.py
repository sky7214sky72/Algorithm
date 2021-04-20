#소수: 어떤 수의 약수가 1과 자기자신 밖에 없는 수
# ex) 7,11,17
# 8: 1 2 4 8 소수가 아니다
# 소수를 구하는 방법 
# 2부터 시작해서 자기 자신 수 보다 -1까지 나눠 떨어지는지 확인한다.

import sys

def is_prime(a):
    for i in range(2,a,1):
        if a % i ==0:
            return False
    return True

a = int(sys.stdin.readline())
print(is_prime(a))