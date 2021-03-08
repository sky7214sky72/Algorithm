from bisect import bisect_left,bisect_right

def count_by_number(array,target):
    right_index = bisect_right(array,target)
    left_index = bisect_left(array,target)
    return right_index - left_index

n,m = list(map(int,input().split()))
array = list(map(int,input().split()))
print(count_by_number(array,m))