S = input()
sum = int(S[0])
for i in range(1,len(S)):
    num = int(S[i])
    if sum <=1 or num<=1:
        sum += num
    else:
        sum *= num

print(sum)