def KthLargest(self, nums: List[int], k: int) -> int:
        sort_nums = sorted(nums)
        return sort_nums[-k]