def solution(new_id):
    answer = ''
    #1step
    new_id  = new_id.lower()
    #2step
    for i in new_id:
        if i.isalpha() or i.isdigit() or i in ['-','_','.']:
            answer += i
    #3step
    while '..' in answer:
        answer = answer.replace('..','.')
    #4step
    if answer[0] == '.':
        answer = answer[1:]
        #처음과 끝이 모두 .인 경우
        if len(answer) != 0 and answer[-1] == '.':
            answer = answer[:-1]
    elif answer[-1] == '.':
        answer = answer[:-1]
    #5step
    if len(answer) == 0:
        answer = 'a'
    #6step
    if len(answer) >= 16:
        answer = answer[:15]
        if answer[-1] == '.':
            answer = answer[:-1]
    #7step
    if len(answer) <= 2:
        while len(answer) < 3:
            answer = answer + answer[-1]
    return answer