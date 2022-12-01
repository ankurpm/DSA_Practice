package com.dsa.arrays101.inplaceoperations;

/**
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order
 * of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 */
public class MoveZeros {

    /**
     * Solution is brute force, not optimized for space
     * @param nums
     * Time Complexity = O(n)
     * Space Complexity = O(n)
     */
    public void moveZeroes1(int[] nums) {

        int len = nums.length;
        int[] newArr = new int[len];
        int j=0;
        int zeros=0;
        for(int i=0; i< len; i++){
            if(nums[i] != 0){
                newArr[j] = nums[i];
                j++;
            }else {
                zeros++;
            }
        }
        while (zeros>0){
            newArr[len-zeros]=0;
            zeros--;
        }
        for(int i=0; i<len; i++){
            nums[i]=newArr[i];
        }
    }

    /**
     * Using in-place algorithm
     * Use two pointers
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int left=0; int right=1;
        while(right < nums.length){
            // If l is zero and r is non-zero
            if(nums[left] == 0 && nums[right] !=0){
                nums[left] = nums[right];
                nums[right] = 0;
                left++; right++;
            // If l is non-zero and r is anything
            } else if (nums[left] != 0) {
                left++; right++;
            // If l and r are both zero
            }else{
                right++;
            }
        }
    }
}
