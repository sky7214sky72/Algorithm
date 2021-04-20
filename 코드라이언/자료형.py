#Number
a = 222 + 135 #int
b = 1.6 * 8 #float
c = 2 ** 10 # 2^10,int

# print(a,b,c)
# print(type(a),type(b),type(c))


#String
s = 'WonSeok'

# print(len(s))
# print(s[0],s[5],s[-1],s[-2])
# print(s[1:3],s[1:],s[0:3],s[:2]) #1~3까지 , 1부터 끝까지 , 0부터 3까지 ,처음부터 2까지 

# s = 'aaa bbb ccc ddd'
# sl = s.split()#whitespace 기준으로 분리됨 whitespace = space , tav, enter(개행)
# print(sl)

# import sys
# a = sys.stdin.readline()
# a = a.split()
# print(a)



#List
# l = [1,2,3,4,5]
# print(l,len(l))
# l.append(6)
# l.append(7)
# print(l)
# l.append(13)
# l.append(12)
# l.append(11)
# l.sort()
# print(l)


#2차원 리스트
l = [[1,2,3,4,5],[6,7,8,9,10],[11,12,13,14,15]]
print(l[0][0],l[1][2])

for i in range(len(l)):
    for j in range(len(l[i])):
        print(l[i][j],end=' ')
    print()



#dict
d = {
    'name' : 'WonSeok',
    'phone' : '010-1234-1234',
    'nickname': 'sisobus',
    'sub-nickname': 'hihihi'
    } #key:value 형태

print(d,type(d))
print(d['nickname'])
d['age'] = 31
print(d)
if 'age' in d:
    print(d['age'])


#set 중복을 허용하지 않는 리스트
s = set()    
s.add(1)
s.add(1)
s.add(1)
s.add(1)
s.add(1)
s.add(1)
s.add(2)
s.add(3)
print(s)

#tuple 쌍을 의미 (길이가 주어져 있는 리스트를 튜플이라고 부른다)
t = (1,2,3)
a,b,c = (1,2,3)
d,e,f = [4,5,6]
print(t,a,b,c)
print(d,e,f)


#boolean True,False

#map(function,list): list의 모든 원소에 function을 적용해서 새로운 리스트를 반환한다.
#한 줄에 세개의 정수를 입력받는다.
import sys
a = sys.stdin.readline() # 3 4 5 = > "3 4 5"
# l = a.split() #["3","4","5"]
l = list(map(int,a.split()))
print(l)


