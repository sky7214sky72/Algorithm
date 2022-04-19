"""
    *
   **
  ***
 ****
*****
"""
n = int(input())
for i in range(n, 0, -1):
    for j in range(n):
        if j <= i-2:
            print('', end=' ')
        if j > i-2:
            print('*', end='')
    print('')

