# LC 26 Remove Duplicates from Sorted Array

def removeDuplicates(nums):
    left = 1
    for right in range(1, len(nums)):
        if nums[right] > nums[right - 1]:
            nums[left] = nums[right]
            left+=1
    return left