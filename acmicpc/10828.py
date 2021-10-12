"""
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
"""

import sys

input = sys.stdin.readline
"""
sys.stdin.readline 쓰는 이유! 

반복문으로 여러줄을 입력받아야 할 때는 input()만 쓰면 시간초과가 발생할 수 있다. 

그래서 한줄씩 반환하는 sys.stdin.readline를 사용
"""
stack = []
n = int(input())
for i in range(n):
    n = input().split()
    if n[0] == 'push':
        stack.append(n[1])
    elif n[0] == 'pop':
        if not stack:
            print('-1')
        else:
            print(stack.pop())
    elif n[0] == 'size':
        print(len(stack))
    elif n[0] == 'empty':
        if not stack:
            print(1)
        else:
            print(0)
    elif n[0] == 'top':
        if not stack:
            print('-1')
        else:
            print(stack[-1])