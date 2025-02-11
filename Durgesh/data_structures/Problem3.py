# Q. Find elements having odd frequencies in the array.

# Approach:
#          store {element: frequency} in a map.  -->  iterate over the map -> print the odd frequency elements.

t = int(input())

for _ in range(t):
    arr = list(map(int, input().split()))
    map = {}
    for i in arr:
        if i in map:
            map[i] += 1
        else:
            map[i] = 1
    
    for key, value in map.items():
        if value % 2 != 0:
            print(key, end = " ")