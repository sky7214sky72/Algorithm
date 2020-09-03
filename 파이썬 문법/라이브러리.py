result = sum([1,2,3,4,5])
print(result)


result = min(7,3,5,2)
print(result)

result = max(7,3,5,2)
print(result)

result = eval("(3+5)*7")
print(result)

result = sorted([9,1,8,5,4])
print(result)

result = sorted([9,1,8,5,4],reverse=True)
print(result)

result = sorted([('홍길동',35),('이순신',70),('아무개',50)],key= lambda x:x[1],reverse=True)
print(result)

data = [9,1,8,5,4]
data.sort()
print(data)

from itertools import permutations

data = ['A','B','C']

result = list(permutations(data,3)) #모든 순열 구하기
print(result)

from itertools import combinations

data = ['A','B','C']
result = list(combinations(data,2))
print(result)

from itertools import product

data = ['A','B','C']
result = list(product(data,repeat=2))
print(result)

from itertools import combinations_with_replacement
data = ['A','B','C']
result = list(combinations_with_replacement(data,2))
print(result)

import heapq
def heapsort(iterable):
    h = []
    result = []
    #모든 원소를 차례대로 입에 삽입
    for value in iterable:
        heapq.heappush(h,value)
    #힙에 삽입된 모든 원소를 차례대로 꺼내며 담기
    for i in range(len(h)):
        result.append(heapq.heappop(h))
    return result

result = heapsort([1,3,5,7,9,2,4,6,8,0])
print(result)


#최대힙 내림차순 정렬

def heapsort(iterable):
    h = []
    result = []
    for value in iterable:
        heapq.heappush(h,-value)
    for i in range(len(h)):
        result.append(-heapq.heappop(h))
    return result
result = heapsort([1,3,5,7,9,2,4,6,8,0])
print(result)

#이진탐색 라이브러리
from bisect import bisect_left,bisect_right

a=[1,2,4,4,8]
x=4

print(bisect_left(a,x))
print(bisect_right(a,x))

def count_by_range(a, left_value, right_value):
    right_index = bisect_right(a,right_value)
    print(right_index)
    left_index = bisect_left(a,left_value)
    print(left_index)
    return right_index - left_index

a = [1,2,3,3,3,3,4,4,8,9]

print(count_by_range(a,4,4))
print(count_by_range(a,-1,3))

#collections
from collections import deque

data = deque([2,3,4])
data.appendleft(1) #제일 앞쪽 삽입
data.append(5) #제일 뒤쪽 삽입

print(data)
print(list(data)) #리스트 자료형으로 변환

#갯수 세줌
from collections import Counter
counter = Counter(['red','blue','red','green','blue','blue'])

print(counter['blue'])
print(counter['green'])
print(dict(counter))#사전 자료형으로 변환

import math
print(math.factorial(5))#5팩토리얼

import math
print(math.sqrt(7))#7의 제곱근

print(math.gcd(21,14)) #최대공약수
print(math.pi)#pi
print(math.e)#자연상수 e