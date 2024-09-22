"""
Problem 1 :-
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
"""

def get_step_count(n: int):
    """
    Recursion function to get the fibonacci numbers
    :param n: Integer number
    :return: Sum of last two calls

    """
    if n <= 1:
        return n
    return get_step_count(n - 1) + get_step_count(n - 2)


if __name__ == "__main__":
    n = 20 #Given Number
    step_counts = get_step_count(n)
    print(f"Number of ways to climb {n} stpes is {step_counts}")

