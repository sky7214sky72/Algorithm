def solution(new_id):
    answer = ''

    # STEP 1
    new_id = new_id.lower()

    # STEP 2
    for ch in new_id:
        if ch.isalpha() or ch.isdigit() or ch in ['-', '_', '.']:
            answer += ch

    # STEP 3
    while '..' in answer:
        answer = answer.replace('..', '.')

    # STEP 4
    if answer[0] == '.':
        answer = answer[1:] if len(answer) > 1 else '.'
    if answer[-1] == '.':
        answer = answer[:-1]

    # STEP 5 ~ 6
    answer = 'a' if len(answer) == 0 else answer[:15]

    # STEP 6
    if answer[-1] == '.':
        answer = answer[:-1]

    # STEP 7
    while len(answer) < 3:
        answer += answer[-1]

    return answer

