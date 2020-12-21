pay = int(input())
coin = [500,100,50,10,5,1]
change_m = 1000 - pay
count = 0
for i in coin:
    count = count + (change_m // i)
    change_m = change_m % i

print(count)

