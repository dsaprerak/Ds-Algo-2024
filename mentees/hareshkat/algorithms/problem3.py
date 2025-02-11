"""
Problem 3:-
Given an array of integers. Find the numbers whose occurrence in the array is odd.
Note: Integers are from 0 to 100 and length of array is greater than the max value in Array
"""


def get_odd_elements(lst: list) -> list:
    """
    Get the list of elements whose count in the list is Odd.
    :param lst:  of elements
    :return: list of elements
    """
    unique_elements = set(lst)
    odd_elements = []
    for i in unique_elements:
        element_count = lst.count(i)
        if element_count%2 == 1 and i not in odd_elements:
            odd_elements.append(i)
    return odd_elements


if __name__ == "__main__":
    lst =  [1,3,4,2,4,1,4]
    odd_occurrence_elements = get_odd_elements(lst)
    print(f"Elements whose occurrence in the list is odd are {odd_occurrence_elements}")