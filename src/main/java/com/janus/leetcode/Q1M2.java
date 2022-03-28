package com.janus.leetcode;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */
public class Q1M2 {
    /**
     * Use the common cycle to solve.
     *
     * @param nums   the input nums
     * @param target the given target
     * @return result with solution
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result = new int[]{i, j};
                    return result;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        Q1M2 q1M1 = new Q1M2();
        System.out.println(Arrays.toString(q1M1.twoSum(new int[]{2, 5, 5, 11}, 10)));
    }
}
