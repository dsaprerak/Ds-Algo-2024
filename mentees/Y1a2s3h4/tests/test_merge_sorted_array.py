import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'algorithms', 'two_pointer')

sys.path.append(algorithms_dir)
from merge_sorted_array import merge


''' Testing Problem 1 '''

nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3

expected_output = [1,2,2,3,5,6]
merge(nums1, nums2, m, n)
print("\nTest Case 1")
print("Expected Output: {}\nYour Output: {}".format(expected_output, nums1))



''' Testing Problem 2 '''

nums1 = [1]
m = 1
nums2 = []
n = 0

expected_output = [1]
merge(nums1, nums2, m, n)
print("\nTest Case 1")
print("Expected Output: {}\nYour Output: {}".format(expected_output, nums1))
