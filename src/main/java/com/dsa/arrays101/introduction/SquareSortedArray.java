package com.dsa.arrays101.introduction;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 */
public class SquareSortedArray {
    public static void main(String[] args) {

        int[] arr = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(arr));
        int[] squares = sortedSquares(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] sortedSquares(int[] arr) {
        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
       Arrays.sort(arr);
        return arr;
    }
}
