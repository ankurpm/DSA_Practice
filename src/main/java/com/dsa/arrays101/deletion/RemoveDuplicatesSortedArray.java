package com.dsa.arrays101.deletion;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique
 * element appears only once. The relative order of the elements should be kept the same.
 *
 * Since it is impossible to change the length of the array in some languages, you must instead have the result be
 * placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates,
 * then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first
 * k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1)
 * extra memory.
 */
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        //int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1,1,2,2,3,3,4};
        //int[] nums = {1,1,1,1};
        //int[] nums = {1};
        System.out.println("Before array = "+ Arrays.toString(nums));

        long startTime = System.nanoTime();
        int i = removeDuplicates1(nums);
        //int i = removeDuplicates2(nums);
        long stopTime = System.nanoTime();
        long timeElapsed = stopTime-startTime;
        System.out.println(timeElapsed);
        System.out.println("Length of new array = "+i);
        System.out.println("After array = "+Arrays.toString(nums));

    }
    public static int removeDuplicates1(int[] nums) {
        if(nums.length ==1){
            return 1;
        }
        int l = 0;
        int r=1;
        while(r<nums.length){
            if(nums[l] != nums[r]){
                l++;
                nums[l] = nums[r];
            }
            r++;
        }
        return l+1;

    }
    public static int removeDuplicates2(int[] nums) {
        int left = 1;
        for(int right=1; right< nums.length; right++){
            if(nums[right] != nums[right-1]){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;

    }
}
