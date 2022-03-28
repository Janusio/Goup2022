package com.janus.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Q1M1 {
    /**
     * Use the hash map to solve .
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * @param nums   the input nums
     * @param target the given target
     * @return result with solution
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0, numsLength = nums.length; i < numsLength; i++) {
            int requirePair = target - nums[i];
            if (maps.containsKey(requirePair)) {
                return new int[]{maps.get(requirePair), i};
            }
            maps.put(nums[i], i);

        }
        return null;
    }

    public static void main(String[] args) {
        Q1M1 q1M1 = new Q1M1();
        System.out.println(Arrays.toString(q1M1.twoSum(new int[]{2, 5, 5, 11}, 10)));
    }
}
