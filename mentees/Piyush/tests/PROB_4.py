class Solution(object):
    def findDuplicate(self, nums):
        left, right = 1, len(nums) - 1
        
        while left < right:
            mid = (left + right) // 2
            count = sum(num <= mid for num in nums)  # Count how many numbers are ≤ mid
            
            if count > mid:
                right = mid  # Duplicate must be in the left part
            else:
                left = mid + 1  # Duplicate must be in the right part
        
        return left  # Returning the duplicate number after the loop
