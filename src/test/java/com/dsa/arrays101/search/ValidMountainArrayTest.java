package com.dsa.arrays101.search;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidMountainArrayTest {
    ValidMountainArray vma = new ValidMountainArray();

    @Test
    @DisplayName("Test Case 1")
    void testValidMountainArray1(){
        int[] arr = {0,1};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 2")
    void testValidMountainArray2(){
        int[] arr = {3,2,1};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 3")
    void testValidMountainArray3(){
        int[] arr = {0,1,3};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 4")
    void testValidMountainArray4(){
        int[] arr = {0,1,2,3,3,2,1};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 5")
    void testValidMountainArray5(){
        int[] arr = {0,1,2,3,3};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 6")
    void testValidMountainArray6(){
        int[] arr = {0,1,2,3,2,1,2,3,0};
        assertFalse(vma.validMountainArray(arr));
    }

    @Test
    @DisplayName("Test Case 7")
    void testValidMountainArray7(){
        int[] arr = {0,1,2,3,2,1,0};
        assertTrue(vma.validMountainArray(arr));
    }
}
