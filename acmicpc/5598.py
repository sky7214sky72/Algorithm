"""
가이우스 율리우스 카이사르(Gaius Julius Caesar)는 고대 로마 군인이자 정치가였다. 카이사르는 비밀스럽게 편지를 쓸 때, 'A'를 'D로', 'B'를 'E'로, 'C'를 'F'로... 이런 식으로 알파벳 문자를 3개씩 건너뛰어 적었다고 한다.

26개의 대문자 알파벳으로 이루어진 단어를 카이사르 암호 형식으로 3문자를 옮겨 겹치지 않게 나열하여 얻은 카이사르 단어가 있다. 이 카이사르 단어를 원래 단어로 돌려놓는 프로그램을 작성하시오.

각 문자별로 변환 전과 변환 후를 나타낸 건 아래와 같다.
"""
caesar = input()
for i in caesar:
    if ord(i) == 65:
        i = 88
    elif ord(i) == 66:
        i = 89
    elif ord(i) == 67:
        i = 90
    else:
        i = ord(i) - 3
    print(chr(i),end='')