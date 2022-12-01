package com.dsa.arrays101.conclusion;

import java.util.*;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        Map<Integer,Integer> mymap = new HashMap<>();
        List<Integer> missing = new ArrayList<>();
        for(int i=0; i<len; i++){
            mymap.put(i,nums[i]);
        }
        for(int i=1; i<=len; i++){
            if(!mymap.containsValue(i)){
                missing.add(i);
            }
        }
        return missing;
    }
}
