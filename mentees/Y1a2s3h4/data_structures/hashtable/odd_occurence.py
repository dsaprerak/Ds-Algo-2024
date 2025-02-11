'''
Problem 3:-

Given an array of integers. Find the numbers whose occurence in the array is odd. 

Note: Integers are from 0 to 100 and length of array is greater than the max value in Array

For eg: 
Input: [1,3,4,2,4,1,4]

Output: [3,4,2]; Since 3 & 2 is repeated once, 4 is repeated three times.
'''


def odd_occurence(nums):
    d = {}
    for i in nums:
        if i in d:
            d[i] += 1
        else:
            d[i] = 1
    res = []
    for i in d.keys():
        if d[i] % 2 != 0:
            res.append(i)
    return res
    