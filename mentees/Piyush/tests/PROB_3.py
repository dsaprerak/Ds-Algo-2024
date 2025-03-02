# Problem 3:-

# Given an array of integers. Find the numbers whose occurence in the array is odd. 

# Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

# For eg: 
# Input: [1,3,4,2,4,1,4]

# Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.
# Code:
def find_odd_occurrences(nums):
    return [num for num in set(nums) if nums.count(num)%2!=0]

nums = [1,1, 2, 4, 3, 4, 3, 4]
print(find_odd_occurrences(nums))  