a,b = map(int,input().split())
sum = a + b
answer = str(bin(sum))
print(answer[2:])