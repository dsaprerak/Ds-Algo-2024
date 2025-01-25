import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'algorithms', 'two_pointer')

sys.path.append(algorithms_dir)
from count_number_of_pairs_with_absolute_difference_k import countKDifference


''' Test Case 1 '''

nums = [3,2,1,5,4]
k = 2

print("Total number of pairs with absolute difference of {}: ".format(k), countKDifference(nums, k))

''' Test Case 2 '''

nums = [1,3]
k = 3

print("Total number of pairs with absolute difference of {}: ".format(k), countKDifference(nums, k))