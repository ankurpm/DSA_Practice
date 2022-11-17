package com.dsa.arrays.inplaceoperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoveZerosTest {

    MoveZeros mz = new MoveZeros();

    @Test
    @DisplayName("Test Case 1")
    void test1(){
        int[] arr = {0};
        mz.moveZeroes(arr);
        int[] output = {0};
        assertEquals(Arrays.toString(output),Arrays.toString(arr));
    }

    @Test
    @DisplayName("Test Case 2")
    void test2(){
        int[] arr = {0,1};
        mz.moveZeroes(arr);
        int[] output = {1,0};
        assertEquals(Arrays.toString(output),Arrays.toString(arr));
    }

    @Test
    @DisplayName("Test Case 3")
    void test3(){
        int[] arr = {1,2,3,0,4};
        mz.moveZeroes(arr);
        int[] output = {1,2,3,4,0};
        assertEquals(Arrays.toString(output),Arrays.toString(arr));
    }

    @Test
    @DisplayName("Test Case 4")
    void test4(){
        int[] arr = {0,1,0,3,12};
        mz.moveZeroes(arr);
        int[] output = {1,3,12,0,0};
        assertEquals(Arrays.toString(output),Arrays.toString(arr));
    }


}
