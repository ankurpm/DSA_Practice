package com.java.dsa.arrays;

import java.util.Arrays;

public class DuplicateExistingZeros {

    public static void main(String[] args) {
        int[] arr = {1,0,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void duplicateZeros(int[] arr) {
        int[] newArr = new int[arr.length];
        int j=0;
        for (int k : arr) {
            if (j < arr.length) {
                newArr[j] = k;
                if (k == 0 && j + 1 != arr.length) { //edge case here, when j value is already equal to length of array, we doing j++, which will cause array index out of bounds
                    j++;
                    newArr[j] = 0;
                }
                j++;
            }
        }
        System.arraycopy(newArr, 0, arr, 0, newArr.length);
    }
}
