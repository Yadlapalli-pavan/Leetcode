class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        a = nums[0]
        b = len(nums)
        max1 = -1
        for i in range(1, b):
            if nums[i] > a:
                max1 = max(max1, nums[i] - a)
            else:
                a = nums[i]
        return max1
