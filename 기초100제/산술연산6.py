# 정수 3개를 입력받아 합과 평균을 출력해보자.
a,b,c = input().split()
a,b,c = int(a),int(b),int(c)
print(sum([a,b,c]))
print('%.1f'%(sum([a,b,c])/3))