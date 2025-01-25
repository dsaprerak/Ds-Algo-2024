import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'data_structures', 'hashtable')

sys.path.append(algorithms_dir)
from intersection_of_two_arrays import intersect


''' Testing Problem 1 '''

nums1 = [1,2,2,1]
nums2 = [2,2]
expected_output = [2,2]
your_output = intersect(nums1, nums2)
print("\nTest Case 1")
print("Order of elements does not matter!")
print("Expected Output: {}\nYour Output: {}".format(expected_output, your_output))


''' Testing Problem 1 '''

nums1 = [4,9,5]
nums2 = [9,4,9,8,4]
expected_output = [4,9]
your_output = intersect(nums1, nums2)
print("\nTest Case 2")
print("Order of elements does not matter!")
print("Expected Output: {}\nYour Output: {}".format(expected_output, your_output))
