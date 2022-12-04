package com.dsa.arraystring;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiagonalTraverseTest {

    DiagonalTraverse dt = new DiagonalTraverse();

    @Test
    @DisplayName("Test 1")
    void test1(){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[] output = dt.findDiagonalOrder(input);
        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};
        assertEquals(Arrays.toString(expected),Arrays.toString(output));
    }

    @Test
    @DisplayName("Test 2")
    void test2(){
        int[][] input = {{1,2},{3,4}};
        int[] output = dt.findDiagonalOrder(input);
        int[] expected = {1, 2, 3, 4};
        assertEquals(Arrays.toString(expected),Arrays.toString(output));
    }
}
