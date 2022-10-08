package com.dsa.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

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
