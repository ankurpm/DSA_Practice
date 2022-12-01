package com.dsa.arraystring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOneTest {

    PlusOne po = new PlusOne();

    @Test
    @DisplayName("Test 1")
    void test1(){
        int[] arr = {1,2,3};
        int[] result = po.plusOne(arr);
        int[] desired = {1,2,4};
        assertEquals(Arrays.toString(desired),Arrays.toString(result));
    }

    @Test
    @DisplayName("Test 2")
    void test2(){
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] result = po.plusOne(arr);
        int[] desired = {9,8,7,6,5,4,3,2,1,1};
        assertEquals(Arrays.toString(desired),Arrays.toString(result));
    }

    @Test
    @DisplayName("Test 3")
    void test3(){
        int[] arr = {9};
        int[] result = po.plusOne(arr);
        int[] desired = {1,0};
        assertEquals(Arrays.toString(desired),Arrays.toString(result));
    }
}
