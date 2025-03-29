package org.lab1.Main;

public class Lab1 {

    /**
     * This method returns the minimum value in a given array of integers.
     * It uses an iterative approach to check each element in the array.
     *
     * Time complexity: O(n), where n is the number of elements in the array.
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
     * This method calculates the average of elements in an array.
     *
     * Time complexity: O(n), where n is the number of elements.
     *
     * @param arr The array of integers.
     * @return The average value as a double.
     */
    public static double average(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    /**
     * This method checks whether a number is prime using recursion.
     *
     * Time complexity: O(√n)
     *
     * @param n The number to check.
     * @return True if prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrimeHelper(n, i + 1);
    }
}
