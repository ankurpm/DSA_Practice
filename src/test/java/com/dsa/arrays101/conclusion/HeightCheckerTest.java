package com.dsa.arrays101.conclusion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeightCheckerTest {

    HeightChecker hc = new HeightChecker();

    @Test
    @DisplayName("Test case 1")
    void test1(){
        int[] arr = {1};
        int result = hc.heightChecker(arr);
        int desired = 0;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 2")
    void test2(){
        int[] arr = {1,1,4,2,1,3};
        int result = hc.heightChecker(arr);
        int desired = 3;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 3")
    void test3(){
        int[] arr = {5,1,2,3,4};
        int result = hc.heightChecker(arr);
        int desired = 5;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 4")
    void test4(){
        int[] arr = {1,2,3,4,5};
        int result = hc.heightChecker(arr);
        int desired = 0;
        assertEquals(desired,result);
    }
}
