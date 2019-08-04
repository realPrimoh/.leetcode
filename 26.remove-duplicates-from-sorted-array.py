#
# @lc app=leetcode id=26 lang=python3
#
# [26] Remove Duplicates from Sorted Array
#
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums) == 0 or len(nums) == 1:
            return len(nums)
        indexesToRemove = []
        for i in range(1, len(nums)):
            if (nums[i] == nums[i-1]):
                indexesToRemove.append(i)
        for j in range(len(indexesToRemove)):
            del(nums[indexesToRemove[j]])
        return len(nums)

