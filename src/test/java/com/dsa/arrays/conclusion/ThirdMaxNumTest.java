package com.dsa.arrays.conclusion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaxNumTest {

    ThirdMaxNum tmn = new ThirdMaxNum();

    @Test
    @DisplayName("Test case 1")
    void test1(){
        int[] arr = {1};
        int result = tmn.thirdMax(arr);
        int desired = 1;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 2")
    void test2(){
        int[] arr = {1,2};
        int result = tmn.thirdMax(arr);
        int desired = 2;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 3")
    void test3(){
        int[] arr = {1,2,3};
        int result = tmn.thirdMax(arr);
        int desired = 1;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 4")
    void test4(){
        int[] arr = {3,2,1};
        int result = tmn.thirdMax(arr);
        int desired = 1;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 5")
    void test5(){
        int[] arr = {1,1,2};
        int result = tmn.thirdMax(arr);
        int desired = 2;
        assertEquals(desired,result);
    }

    @Test
    @DisplayName("Test case 6")
    void test6(){
        int[] arr = {1,2,-2147483648};
        int result = tmn.thirdMax(arr);
        int desired = -2147483648;
        assertEquals(desired,result);
    }

}
