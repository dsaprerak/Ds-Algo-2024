# Que: Return the kth largest element in the array.
# Array can contain duplicate elements.

#  Approach: 
#           create list of unique elements  -->  sort it  -->  Return the kth element.



t = int(input())

for _ in range(t):
    K = int(input())
    arr = list(map(int, input().split()))
    arr.sort()
    unique_array = sorted(set(arr))
    print(unique_array[K-1])