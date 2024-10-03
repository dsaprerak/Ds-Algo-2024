import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'data_structures', 'hashtable')

sys.path.append(algorithms_dir)
from odd_occurence import odd_occurence


''' Testing Problem 1 '''

# Test case 1 
# nums = [1,3,4,2,4,1,4]

nums = [1,3,4,2,4,1,4]
expected_output = [2, 3, 4]
your_output = odd_occurence(nums)
print("\nTest Case 1")
print("n = {}\nExpected Output: {}\nYour Output: {}".format(nums, expected_output, your_output))

# Test case 2
# nums = [2,9,2,0,1,3,1,0,3]

nums = [2,9,2,0,1,3,1,0,3,3]
expected_output = [9, 3]
your_output = odd_occurence(nums)
print("\nTest Case 2")
print("nums = {}\nExpected Output: {}\nYour Output: {}".format(nums, expected_output, your_output))
