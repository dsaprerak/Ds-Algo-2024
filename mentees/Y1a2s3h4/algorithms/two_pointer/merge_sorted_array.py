# LC 88 Merge Sorted Array

""" 
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
"""

def merge(arr1, arr2, m, n):
    fullIdx = m + n - 1
    m -= 1
    n -= 1

    while n>=0:
        if m>0 and arr1[m] > arr2[n]:
            arr1[fullIdx] = arr1[m]
            m -= 1
        else:
            arr1[fullIdx] = arr2[n]
            n -= 1
        fullIdx -= 1
    