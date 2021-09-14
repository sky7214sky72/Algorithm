"""
양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
"""

t = int(input())
n = list()
bin_list = list()
for i in range(t):
    n.append(int(input()))

for i in n:
    changeNum = bin(i)
    changeNum = changeNum[::-1]
    bin_list.append(changeNum)

for i in bin_list:
    for j in range(len(i)):
        if i[j] == '1':
            print(j,end=' ')

    print('')
