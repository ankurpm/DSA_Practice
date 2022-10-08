package com.dsa.arrays;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,25,6,7896};
        System.out.println(findNumbers(nums));

        }
    private static int findNumbers(int[] nums) {
        int count=0;
        for (int i:nums
             ) {
            if(String.valueOf(i).length()%2==0){
                count++;
            }
        }
        return count;
    }
}
