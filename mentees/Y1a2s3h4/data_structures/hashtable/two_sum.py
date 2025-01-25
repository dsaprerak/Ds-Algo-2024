# LC 1 Two Sum

def twoSum(arr, target):
    d = {}
    for i in range(0, len(arr)):
        n = arr[i]
        if n in d:
            return [d[n], i]
        else:
            d[target - n] = i
    return []