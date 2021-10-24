"""
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
"""

n = int(input())
star = 1

for i in range(1,n+1):
    print(' ' * (n - i), end='')
    print('*'* star)
    star+=2

star = 1

for i in range(1,n-1):
    star+=2

for i in range(1,n):
    print(' ' * i, end='')
    print('*'*star)
    star-=2

