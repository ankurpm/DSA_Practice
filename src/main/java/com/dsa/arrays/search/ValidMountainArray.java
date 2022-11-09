package com.dsa.arrays.search;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 */
public class ValidMountainArray {

    public static void main(String[] args) {
        //int[] arr = {3,2,1};
        //int[] arr = {0,1,0};
        int[] arr = {0,1,3};
        //int[] arr = {0,1,3,3};
        //int[] arr = {0,0,1,2,3,2,1};
        //int[] arr = {0,1,2,4,2,1};
        //int[] arr = {0,1,2,3,4,5,6,7,8,9};



        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len<3){
            return false;
        }
        if(arr[0]>=arr[1]){
            return false;
        }
        int i=1;
        while(i+1<len && arr[i]<arr[i+1]){
            i++;
        }
        if(i==len-1){
            return false;
        }
        if(i+1<len && arr[i] == arr[i+1]){
            return false;
        }
        while(i+1<len && arr[i]>arr[i+1]){
            i++;
        }
        if(i==len-1){
            return true;
        }
        return false;

    }
}
