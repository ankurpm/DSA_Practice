package com.dsa.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The relative order of the elements may be changed.
 *
 * Since it is impossible to change the length of the array in some languages,
 * you must instead have the result be placed in the first part of the array nums.
 * More formally, if there are k elements after removing the duplicates, then the first k elements of nums should
 * hold the final result. It does not matter what you leave beyond the first k elements.
 *
 * Return k after placing the final result in the first k slots of nums.
 *
 * Do not allocate extra space for another array.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4}; int val = 3;
        System.out.println("Before array = "+Arrays.toString(nums));
        int i = removeElement(nums, val);
        System.out.println("value of return is "+i);
        System.out.println("After array = "+Arrays.toString(nums));
    }

    /**
     * This solution involves two pointer technique.
     * One pointer l from index 0
     * One pointer r from index len-1
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int l= 0;
        int r= nums.length-1;
        while(l<=r){
            if(nums[l] == val && nums[r] != val){
                nums[l]=nums[r];
                r--;
                l++;
            } else if (nums[l] == val && nums[r] == val) {
                r--;
            }else{
                l++;
            }
        }
        return r+1;
    }
}
