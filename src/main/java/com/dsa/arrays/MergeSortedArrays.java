package com.dsa.arrays;

import java.util.Arrays;

/**
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should
 * be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[]  nums1 = {1,2,3,0,0,0,0};
        int[] nums2 = {2,4,5,6};
        int m = 3; int n =3;
        System.out.println(Arrays.toString(nums1));
        merge1(nums1,m,nums2,n);
        //merge2(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge2(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1[m] = nums2[n - 1];
        }
        int len = nums1.length;
        int lastIndex1 = m-1;
        int lastIndex2 = n-1;
        for(int i= len-1; i>=0; i-- ){
            if(nums1[lastIndex1] > nums2[lastIndex2]){
                nums1[i] = nums1[lastIndex1];
                i--;
                nums1[i] = nums2[lastIndex2];
            }else{
                nums1[i] = nums2[lastIndex2];
                i--;
                nums1[i] = nums1[lastIndex1];
            }
        }
    }

    private static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i< nums2.length;i++){
            nums1[m] = nums2[i];
            m++;
        }
        Arrays.sort(nums1);
    }
}
