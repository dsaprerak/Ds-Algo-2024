import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'data_structures', 'hashtable')

sys.path.append(algorithms_dir)

from two_sum import twoSum

# Test case 1:
nums = [5,2,8,1,9,3]
k = 7
print("Two Sum indices: ", twoSum(nums, k))


# Test case 2:
nums = [8,9,1,5,6,2,8,8,6,0,9]
k = 6
print("Two Sum indices: ", twoSum(nums, k))

