# LC 350 Intersection of Two Arrays II

def intersect(nums1, nums2):
    x = 0
    d = {}
    if len(nums1) >= len(nums2):
        x = 1
    if x == 0:
        for i in nums1:
            d[i] = d.get(i, 0) + 1
    else:
        for i in nums2:
            d[i] = d.get(i, 0) + 1
    def getIntersection(arr):
        ans = []
        for i in arr:
            if i in d and (d[i] > 0):
                ans.append(i)
                d[i] -= 1
        return ans
    if x == 0:
        return getIntersection(nums2)
    else:
        return getIntersection(nums1)
        
    