n, m, k = map(int, input().split())

if m >= k:
    print(-1)
else:
    answer = (n / (k-m)) + 1
    print(int(answer))
