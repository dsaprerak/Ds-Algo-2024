"""
Problem 2 :-
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
"""


def get_kth_element(lst: list, n: int) -> int:
    """
    Get the k+1 element from the list
    :param lst: Given List of elements
    :param n: position number
    :return: n + 1 element from the list by index
    """
    return lst[n-1]


if __name__ == "__main__":
    lst =  [3,2,3,1,2,4,5,5,6]
    k = 4
    sorted_lst = sorted(lst, reverse=True)
    kth_element = get_kth_element(sorted_lst, k)
    print(f"kth largest element in the given list is {kth_element}")