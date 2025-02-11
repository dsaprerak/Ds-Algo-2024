import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'algorithms', 'sorting')

sys.path.append(algorithms_dir)
from kth_largest import kth_largest


''' Testing Problem 1 '''

# Test case 1 
# nums = [3,2,1,5,6,4]

nums = [3,2,1,5,6,4]
k = 2
expected_output = 5
your_output = kth_largest(nums, k)
print("\nTest Case 1")
print("n = {}\nExpected Output: {}\nYour Output: {}".format(nums, expected_output, your_output))

# Test case 2
# nums = [3,2,3,1,2,4,5,5,6]

nums = [3,2,3,1,2,4,5,5,6]
k = 4
expected_output = 4
your_output = kth_largest(nums, k)
print("\nTest Case 2")
print("nums = {}\nExpected Output: {}\nYour Output: {}".format(nums, expected_output, your_output))
