import numpy as np
def OddOccur(arr, arr_size):
    arr1 = [] 
    # arr2 = []
    for i in range(0,arr_size):
        count = 0
        for j in range(0, arr_size):
            if arr[i] == arr[j]:
                count+=1
            
        if (count % 2 != 0):
            arr1.append(arr[i])

    arr2 = np.array(list(set(arr1)))
    return arr2
    
    
arr = [1,3,4,2,4,1,4]
n = len(arr)
print(OddOccur(arr, n))