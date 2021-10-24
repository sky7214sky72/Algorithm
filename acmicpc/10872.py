"""
0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
"""
import sys
#백준기준 재귀함수 깊이가 초과하면 런타임 에러가 발생해서 최대 재귀 깊이를 변경해야한다.
sys.setrecursionlimit(10**6)
def factorial(n):
    if n == 1:
        return 1
    elif n == 0:
        return 1
    else:
        return n * factorial(n-1)


n = int(input())
print(factorial(n))
