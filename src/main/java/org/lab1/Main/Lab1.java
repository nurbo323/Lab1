package org.lab1.Main;

public class Lab1 {

    /**
     * This method returns the minimum value in a given array of integers.
     * It uses an iterative approach to check each element in the array.
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

    /**
     * This method checks if a number is prime.
     * <p>
     * A prime number is only divisible by 1 and itself.
     * We check if any number from 2 to n-1 divides n.
     * <p>
     * Time complexity: O(n), where n is the input number.
     *
     * @param n The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // if divisible by any number, not prime
            }
        }

        return true; // prime if no divisors found
    }

    /**
     * This method calculates the factorial of a number using recursion.
     * <p>
     * The factorial of a number n is the product of all positive integers less than or equal to n.
     * <p>
     * Time complexity: O(n), where n is the input number.
     *
     * @param n The number to find the factorial of.
     * @return The factorial of n.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * This method finds the nth Fibonacci number using recursion.
     * <p>
     * Time complexity: O(2^n), where n is the input number.
     *
     * @param n The index in the Fibonacci sequence.
     * @return The nth Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * This method calculates the value of a raised to the power n using recursion.
     * <p>
     * It multiplies a by itself n times recursively.
     * <p>
     * Time complexity: O(n), where n is the exponent.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power n.
     */
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    /**
     * This method prints the elements of an array in reverse order using recursion.

     * It does not use any additional data structures.

     * Time complexity: O(n), where n is the length of the array.
     *
     * @param arr The array to reverse-print.
     * @param index The current index, usually starting from arr.length - 1.
     */

    public static void reversePrint(int[] arr, int index) {
        if (index < 0) {
            return;
        }

        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }


    /**
     * This method checks if a given string contains only digit characters using recursion.

     * It goes through the string one character at a time,
     * and checks whether each character is a digit.

     * If it finds a non-digit character, it returns false.
     * If it reaches the end of the string without finding any non-digit characters, it returns true.*
     * Time complexity: O(n), where n is the length of the string.
     *
     * @param s     The string to check.
     * @param index The current character index (start with 0).
     * @return true if the string contains only digits, false otherwise.
     */
    public static boolean isOnlyDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }

        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        return isOnlyDigits(s, index + 1);
    }

    /**
     * This method calculates the binomial coefficient C(n, k) using recursion.

     * C(n, k) = C(n-1, k-1) + C(n-1, k)
     * with base cases: C(n, 0) = C(n, n) = 1

     * Time complexity: O(2^n), due to overlapping subproblems.
     *
     * @param n Total number of elements.
     * @param k Number of selected elements.
     * @return The binomial coefficient.
     */
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    /**
     * This method finds the greatest common divisor (GCD) of two numbers using recursion.

     * It uses the Euclidean algorithm: GCD(a, b) = GCD(b, a % b)

     * Time complexity: O(log(min(a, b)))
     *
     * @param a First number.
     * @param b Second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

}











