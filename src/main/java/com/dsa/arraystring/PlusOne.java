package com.dsa.arraystring;

import java.util.*;

/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith
 * digit of the integer. The digits are ordered from most significant to least significant in left-to-right order.
 * The large integer does not contain any leading 0's.
 *
 * Increment the large integer by one and return the resulting array of digits.
 *
 * Constraints:
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 * digits does not contain any leading 0's.
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                break;
            }
            digits[i] = 0;
        }
        if (digits[0] == 0) {
            int[] newArr = new int[digits.length + 1];
            newArr[0] = 1;
            for (int i = 1; i < newArr.length; i++) {
                newArr[i] = 0;
            }
            return newArr;
        }
        return digits;
    }
}
