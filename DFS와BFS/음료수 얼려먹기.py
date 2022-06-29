n, m = map(int, input().split())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))


def dfs(i, j):
    if i <= -1 or i >= n or j <= -1 or j >= m:
        return False
    if graph[i][j] == 0:
        graph[i][j] = 1
        dfs(i - 1, j)
        dfs(i + 1, j)
        dfs(i, j - 1)
        dfs(i, j + 1)
        return True
    return False


result = 0
for i in range(n):
    for j in range(m):
        if dfs(i, j):
            result += 1
print(result)
