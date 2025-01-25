import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'algorithms', 'two_pointer')

sys.path.append(algorithms_dir)

from find_the_duplicate_number import findDuplicate

# Test case 1:
nums = [1,3,4,2,2]
print("The duplicate number is: ", findDuplicate(nums))


# Test case 2:
nums = [16, 30, 10, 22, 34, 1, 18, 5, 11, 14, 20, 8, 40, 33, 6, 23, 13, 31, 7, 19, 28, 29, 12, 36, 35, 17, 37, 9, 21, 3, 4, 15, 27, 32, 24, 25, 26, 38, 39, 2, 5]
print("The duplicate number is: ", findDuplicate(nums))

