package com.dsa.arrays101.introduction;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,1};
        int aaa = findMaxConsecutiveOnes(nums);
        System.out.println(aaa);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
