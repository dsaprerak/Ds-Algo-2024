# Q.  Distinct ways can you climb to the top with 1 or 2 steps at a time.

# Approach:
#           using recursion combine result of climbing 1 step and climbing 2 steps.

# Optimal Approach:
#                using DP to store the result of subproblems

t = int(input())

for _ in range(t):
    n = int(input())
    
    def rec(n):
        if n==1:
            return 1
        if n==0:
            return 1
        if n<0:
            return 0

        return rec(n-1) + rec(n-2)
    
    print(rec(n))


# test cases -> solution
# 2 -> 2
# 3 -> 3
# 4 -> 5
# 6 -> 13
