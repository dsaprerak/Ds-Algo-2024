from typing import List
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        s = set()
        count = 0
        
        for i in nums:
            if i not in s:
                s.add(i)
                nums[count] = i
                count += 1
    
        return count

solution = Solution()
print(solution.removeDuplicates([1,1,2,2,3,4,4,5])) 