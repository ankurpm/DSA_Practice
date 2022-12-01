package com.dsa.arrays101.inplaceoperations;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReplaceElementWithGreatestElementToRightTest {

    ReplaceElementWithGreatestElementToRight ref = new ReplaceElementWithGreatestElementToRight();

    @Test
    @DisplayName("Test Case 1")
    void testCase1(){
        int[] input = {17,18,5,4,6,1};
        int[] result = ref.replaceWithGreatest(input);
        int[] output = {18, 6, 6, 6, 1, -1};
        assertEquals(Arrays.toString(result), Arrays.toString(output));
    }

    @Test
    @DisplayName("Test Case 2")
    void testCase2(){
        int[] input = {17};
        int[] result = ref.replaceWithGreatest(input);
        int[] output = {-1};
        assertEquals(Arrays.toString(result), Arrays.toString(output));
    }
}
