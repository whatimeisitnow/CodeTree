n = int(input())
A = list(map(int, input().split()))

min_val = float('inf')

for i in range(n):
    total = 0
    for idx, a in enumerate(A):
        total += abs(idx - i) * a
    min_val = min(min_val, total)

print(min_val)
