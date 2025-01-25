# LC 287. Find the Duplicate Number
def findDuplicate(arr):
    slow = arr[0]
    fast = arr[arr[0]]

    while fast != slow:
        slow = arr[slow]
        fast = arr[arr[fast]]
    
    fast = 0

    while fast != slow:
        slow = arr[slow]
        fast = arr[fast]
    
    return slow
