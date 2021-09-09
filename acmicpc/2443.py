"""
*********
 *******
  *****
   ***
    *
"""

n = int(input())
star = 1
for i in range(n-1):
    star+=2

for i in range(0,n+1):
    print('*'*star)
    print(' ' * i, end=' ')
    star-=2

