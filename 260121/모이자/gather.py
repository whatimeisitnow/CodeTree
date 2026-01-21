n = int(input())
A = list(map(int, input().split()))

# Please write your code here.
min_val = 1000
for i in range(n):
    target = 0
    sum = 0
    for a in A:
        diff = abs(target - i)
        sum += diff * a
        target += 1
    
    if min_val > sum:
        min_val = sum

print(min_val)

