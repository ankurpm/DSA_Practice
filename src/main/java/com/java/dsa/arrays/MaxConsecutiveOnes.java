package com.java.dsa.arrays;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,1,1};
        int aaa = findMaxConsecutiveOnes(nums);
        System.out.println(aaa);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }
}
