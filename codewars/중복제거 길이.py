list = [1,1,2,-2,5,2,4,4,-1,-2,5]

for i in list:
    cnt = list.count(i)
    if cnt%2 != 0:
        print(i)
