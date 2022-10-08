package com.dsa.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {3,2,3};
        int target = 6;
        //int[] result = twoSum(nums,target);

         secondSolution(nums,target);

    }

    private static int[] secondSolution(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> myApp = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int diff = target-nums[i];
            if(myApp.containsKey(diff)){
                result[0]=i;
                result[1]=myApp.get(diff);
                return result;
            }else{
                myApp.put(nums[i],i );
            }
        }
        return result;

    }


    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<=nums.length-1;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
