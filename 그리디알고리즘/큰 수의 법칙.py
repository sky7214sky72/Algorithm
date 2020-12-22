n,m,k = map(int, input().split())
a = list(map(int,input().split()))
a.sort(reverse=True)
first = a[0]
second = a[1]
result = 0
count = 0
for i in range(m):
    if count != k:
        result += first
        count +=1
    else:
        result += second
        count = 0
print(result)