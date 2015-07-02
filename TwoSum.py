"""
Problem Statement: https://leetcode.com/problems/two-sum/
"""
__author__ = 'kevin'

class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[]}
    def twoSum(self,
               nums, target):
        hashtable = {}
        for i in range(len(nums)):
            numToFind = target - nums[i]

            if numToFind in hashtable:
                return[hashtable[numToFind] + 1, i + 1]
            else:
                hashtable[nums[i]] = i