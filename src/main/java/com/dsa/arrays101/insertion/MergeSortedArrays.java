package com.dsa.arrays101.insertion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        //int[]  nums1 = {1,2,3,0,0,0,0}; int[] nums2 = {2,4,5,6}; int m = 3; int n =4;
        //int[] nums1 = {0}; int[] nums2 = {1}; int m=0; int n=1;
        //int[] nums1 = {2,0}; int[] nums2 = {1}; int m=1; int n=1;
        int[] nums1 = {0,0,0,0,0}; int m=0; int[] nums2 = {1,2,3,4,5}; int n=5;
        System.out.println(Arrays.toString(nums1));
        //merge1(nums1,m,nums2,n);
        //merge2(nums1, m, nums2, n);
        merge3(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge3(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 0; i < nums1.length || j < nums2.length; ) {
            if (j >= nums2.length) {
                list.add(nums1[i]);
                i++;
            } else if (i == m && list.size() < nums1.length) {
                list.add(nums2[j]);
                j++;
            } else if (nums2[j] <= nums1[i]) {
                list.add(nums2[j]);
                j++;
            } else if (nums2[j] >= nums1[i]) {
                list.add(nums1[i]);
                i++;
            }
        }
        for (int i = 0; i < nums1.length && i < list.size(); i++) {
            nums1[i] = list.get(i);
        }
    }


    private static void merge2(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0 && n==1) {
            nums1[m] = nums2[n - 1];
            return;
        }
        int len = nums1.length;
        int lastIndex1 = m - 1;
        int lastIndex2 = n - 1;
        for (int i = len - 1; lastIndex2 >= 0; i--) {
            if (lastIndex1>=0 && nums1[lastIndex1] > nums2[lastIndex2]) {
                nums1[i] = nums1[lastIndex1];
                lastIndex1--;
            } else {
                nums1[i] = nums2[lastIndex2];
                lastIndex2--;
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
