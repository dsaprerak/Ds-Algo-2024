import os
import sys

# Creating an absolute path to the recursion folder code is written, To avoid OS syntax issue.
current_dir = os.path.dirname(os.path.abspath(__file__))
root_dir = os.path.abspath(os.path.join(current_dir, '..'))
algorithms_dir = os.path.join(root_dir, 'algorithms', 'recursion')

sys.path.append(algorithms_dir)
from climbing_staircase import climbing_staircase


''' Testing Problem 1 '''

# Test case 1 
# n = 2

n = 2
expected_output = 2
your_output = climbing_staircase(n)
print("\nTest Case 1")
print("n = {}\nExpected Output: {}\nYour Output: {}".format(n, expected_output, your_output))

# Test case 2
# n = 3

n = 3
expected_output = 3
your_output = climbing_staircase(n)
print("\nTest Case 2")
print("n = {}\nExpected Output: {}\nYour Output: {}".format(n, expected_output, your_output))
