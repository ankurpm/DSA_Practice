package com.dsa.arrays101.search;


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array arr of integers, check if there exist two indices i and j such that :
 *
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {10,2,5,7,3};
        //int[] arr = {7,1,14,11};
        //int[] arr = {-2,0,10,-19,4,6,-8};
        //int[] arr = {0,0};
        //int[] arr = {3,1,7,11};
        //boolean x = checkIfExist1(arr);
        boolean x= checkIfExist2(arr);
        System.out.println(x);

    }

    private static boolean checkIfExist2(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            myMap.put(i, arr[i]);
        }
        return false;
        //myMap.values().stream().map(y -> if())
    }

    public static boolean checkIfExist1(int[] arr) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int twice = arr[i] * 2;
            if (myMap.containsValue(twice) || (arr[i]%2==0 && myMap.containsValue(arr[i]/2))) {
                //second condition is confusing, we have to check half of only the even numbers
                return true;
            }
            myMap.put(i, arr[i]);
        }

        return false;
    }
}
/*

Best thing to learn in this question is {0,0}. If thre is a zero is array, its twice will also be zero.
How you handle that is the interesting case.
 */