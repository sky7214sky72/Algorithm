a=[1,2,3,4,5,6,7,8,9]
print(a)

#인덱스 4, 즉 다섯 번째 원소에 접근
print(a[4])

#빈 리스트 선언 방법 1)
a=list()
print(a)

#빈 리스트 선언 방법 2)
a=[]
print(a)

#크기가 N이고, 모든값이 0인 1차원 리스트 초기화
n=10
a=[0]*n
print(a)

a=[1,2,3,4,5,6,7,8,9]
# 뒤에서 첫번째 원소 출력
print(a[-1])
# 뒤에서 세번째 원소 출력
print(a[-3])
# 네번째 원소 값 변경
a[3]=7
print(a)

a=[1,2,3,4,5,6,7,8,9]
print(a[1:4])

#0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]
print(array)

#1부터 9까지의 수의 제곱 값을 포함하는 리스트
array = [i*i for i in range(1,10)]
print(array)

#N X M 크기의 2차원 리스트 초기화
# _(언더스코어) 값을 무시하고 싶을 경우
n=3
m=3
array = [[0] * m for _ in range(n)]
print(array)

n=3
m=4
array =[[0] * n for _ in range(m)]
array[1][1] = 5
print(array)


a = [1,4,3]
print("기본 리스트:",a)

#리스트에 원소 삽입
a.append(2)
print(a)

#오름차순 정렬
a.sort()
print(a)

#내림차순 정렬
a.sort(reverse=True)
print(a)

#리스트 원소 뒤집기
a.reverse()
print(a)

#특정인덱스에 데이터 추가
a.insert(2,3)
print(a)

#특정값인 데이터 개수 세기
print(a.count(3))

#특정값 데이터 삭제
a.remove(1)
print(a)

a = [1,2,3,4,5,5,5]
remove_set = {3,5}

#remove_set에 포함되지 않은 값만을 저장
result = [i for i in a if i not in remove_set]

print(result)