from typing import List
class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        nums1.sort()
        nums2.sort()
        n = len(nums1)
        m = len(nums2)
        results = []
        i = 0
        j = 0
        while i < n and j < m:
            if nums1[i] == nums2[j]:
                results.append(nums1[i])
                i += 1
                j += 1
            elif nums1[i] < nums2[j]:
                i += 1
            else:
                j += 1
        
        return results
        # 4 5 9  
        # 4 4 8 9 9 