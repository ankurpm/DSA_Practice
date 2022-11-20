package com.dsa.arrays.conclusion;

import java.util.Arrays;

/**
 * A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where expected[i] is the expected
 * height of the ith student in line.
 *
 * You are given an integer array heights representing the current order that the students are standing in.
 * Each heights[i] is the height of the ith student in line (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        int len = heights.length;

        // create a new array
        int[] newArr = new int[len];
        for (int i=0; i<len; i++){
            newArr[i]= heights[i];
        }
        //sort the new array (internally it uses Dual Pivot Quick Sort O(nlogn)
        Arrays.sort(newArr);

        //compare both arrays,
        // increment wrongOrder when element at same index do not match
        int wrongOrder = 0;
        for(int i=0;i<len;i++){
            if(heights[i] != newArr[i]){
                wrongOrder++;
            }
        }
        return wrongOrder;
    }
}
