package com.dsa.arraystring;

import java.util.*;

/**
 * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
 */
public class DiagonalTraverse {

    public int[] findDiagonalOrder(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;
        Map<Integer, List<Integer>> myMap = new HashMap<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(myMap.containsKey(i+j)){
                    List<Integer> existing = myMap.get(i+j);
                    existing.add(mat[i][j]);
                }else{
                    List<Integer> myList = new ArrayList<>();
                    myList.add(mat[i][j]);
                    myMap.put(i+j, myList);
                }
            }
        }

        for (int x: myMap.keySet()
        ) {
            if(x % 2 ==0){
                Collections.reverse(myMap.get(x));
            }
        }
        List<Integer> finalList = new ArrayList<>();
        for (List<Integer> value:myMap.values()
        ) {
            finalList.addAll(value);
        }
        int[] finalArray = new int[finalList.size()];
        int index=0;
        for (int x:finalList
             ) {
            finalArray[index]=x;
            index++;
        }
        return finalArray;

    }
}
