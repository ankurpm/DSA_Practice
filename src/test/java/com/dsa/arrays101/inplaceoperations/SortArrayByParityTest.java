package com.dsa.arrays101.inplaceoperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortArrayByParityTest {

    SortArrayByParity sbp = new SortArrayByParity();

    @Test
    @DisplayName("Test case 1")
    void test1(){
        int[] arr = {1};
        int[] result = sbp.sortArrayByParity(arr);
        assertEquals(Arrays.toString(arr),Arrays.toString(result));

    }

    @Test
    @DisplayName("Test case 2")
    void test2(){
        int[] arr = {3,1,2,4};
        int[] result = sbp.sortArrayByParity(arr);
        int[] desired = {2,4,3,1};
        assertEquals(Arrays.toString(desired),Arrays.toString(result));

    }

    @Test
    @DisplayName("Test case 3")
    void test3(){
        int[] arr = {0,1,2,3,4,5,6};
        int[] result = sbp.sortArrayByParity(arr);
        int[] desired = {0, 2, 4, 6, 1, 5, 3};
        assertEquals(Arrays.toString(desired),Arrays.toString(result));

    }
}
