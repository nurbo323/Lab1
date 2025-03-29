package org.lab1.Main;

public class Lab1 {

    /**
     * This method returns the minimum value in a given array of integers.
     * It uses an iterative approach to check each element in the array.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     * The algorithm iterates through the array once to find the minimum.
     *
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

    /**
     * This method returns the average value of elements in a given array.
     * It performs a single pass through the array to compute the total sum.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
     *
     * @param arr The array of integers.
     * @return The average value of the elements as a double.
     */
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}








