n,k = map(int,input().split())
result = 0

while True:
    #N을 K로 나누어 떨어지는 수가 될때까지 빼기
    target = (n//k)*k
    result += (n-target)
    n = target
    #N이 K보다 낮으면 종료
    if n<k:
        break
    #K로 나누기
    result+=1
    n //= k

#마지막으로 남은 수에 대해 1씩 빼기
result += (n-1)
print(result)
