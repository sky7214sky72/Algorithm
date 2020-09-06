# 첫 줄에 합
# 둘째 줄에 차,
# 셋째 줄에 곱,
# 넷째 줄에 몫,
# 다섯째 줄에 나머지,
# 여섯째 줄에 나눈 값을 순서대로 출력한다.

a,b = input().split()
a,b = int(a),int(b)

print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)
print('%.2f'%(a/b))