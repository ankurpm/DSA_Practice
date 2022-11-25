package com.dsa.arrays.conclusion;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ThirdMaxNum {

    public int thirdMax(int[] nums) {
        int len = nums.length;
        if(len == 1){
            return nums[0];
        }
        if(len == 2){
            if(nums[0]>nums[1]){
                return nums[0];
            }else {
                return nums[1];
            }
        }

        Pair<Integer,Boolean> max1 = new Pair<>(Integer.MIN_VALUE,false);
        Pair<Integer,Boolean> max2 = new Pair<>(Integer.MIN_VALUE,false);
        Pair<Integer,Boolean> max3 = new Pair<>(Integer.MIN_VALUE,false);

        for(int i: nums){
            if((max1.getValue() && max1.getKey() == i) || (max2.getValue() && max2.getKey() == i) || (max3.getValue() && max3.getKey() == i)){
                continue;
            } else if( i >= max1.getKey()){
                max3 = max2;
                max2 = max1;
                max1 = new Pair<>(i,true);
            } else if (i >= max2.getKey()) {
                max3 = max2;
                max2 = new Pair<>(i, true);

            } else if (i >= max3.getKey()) {
                max3 = new Pair<Integer,Boolean>(i,true);
            }
        }

        if(!max3.getValue()){
            return max1.getKey();
        }
        return max3.getKey();

    }
}
