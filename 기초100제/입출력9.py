# 년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자.
# 입력,출력예시 2013.8.5

y,m,d = input().split('.')
print('%04d'%int(y),end='.')
print('%02d'%int(m),end='.')
print('%02d'%int(d))


