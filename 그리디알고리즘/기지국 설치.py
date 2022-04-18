# https://programmers.co.kr/learn/courses/30/lessons/12979?language=python3
# 그리디 알고리즘(지금 당장 좋은것만 고르기)
# 이미 설치된 기지국은 빼고 시작
# n을 루프돌면서 전파가 안 닿으면 일단 설치
# 전파가 닿는곳이면 index 다음으로 넘기고 위치도 다음으로 넘어간다
def solution(n, stations, w):
    position = 1
    answer = 0
    index = 0
    maximumRange = 2 * w + position
    while position <= n:
        if index < len(stations) and position >= stations[index] - w:
            position = stations[index] + w + 1
            index += 1
        else:
            position += maximumRange
            answer += 1
    return answer


print(solution(11, [4, 11], 1))
print(solution(16, [9], 2))
