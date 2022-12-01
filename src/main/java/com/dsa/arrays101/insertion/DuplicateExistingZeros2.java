package com.dsa.arrays101.insertion;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DuplicateExistingZeros2 {

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,0,4,5,6};
        System.out.println(Arrays.toString(arr));
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * This approach uses queue, so queue consumes less space as its constantly being emptied
     * Iterate the original array
     * If element is not zero copy in the Q and replace array element with the first element in the Q, using poll()
     * If element in the original array is 0, then copy it twice in the Q and replace array element with the first element in the Q, using poll()
     * Keep going until the length of the array
     * @param arr
     */
    private static void duplicateZeros(int[] arr) {
        //create new array of same length
        Queue<Integer> myQ = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                myQ.add(arr[i]);
                myQ.add(0);
            }else{
                myQ.add(arr[i]);
            }
            arr[i] = myQ.poll();
        }

    }


}
