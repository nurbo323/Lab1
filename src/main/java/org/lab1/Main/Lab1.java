package org.lab1.Main;

public class Lab1 {

    /**
     * This method returns the minimum value in a given array of integers.
     * It uses an iterative approach to check each element in the array.
     * Time complexity: O(n), where n is the number of elements in the array.
     * @param arr The array of integers to search through.
     * @return The smallest integer found in the array.
     */
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }

}

