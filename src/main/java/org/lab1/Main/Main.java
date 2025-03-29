package org.lab1.Main;

public class Main {

    public static void main(String[] args) {

        //min
        int[] numbers = {10, 1, 32, 3, 45};

        int min = Lab1.findMinimum(numbers);

        System.out.println("Minimum number in array is: " + min); // Ожидаем: 1

        // Test for average calculation
        int[] arr2 = {3, 5, 2, 6, 4, 1};
        System.out.println("Average: " + Lab1.average(arr2)); // Output: 2.5

        // Test for prime number check
        int number1 = 7;
        System.out.println("Is " + number1 + " Prime? " + Lab1.isPrime(number1)); // Output: true

        int number2 = 10;
        System.out.println("Is " + number2 + " Prime? " + Lab1.isPrime(number2)); // Output: false

        // Test for factorial calculation
        int number3 = 5;  // Renamed to avoid conflict
        System.out.println("Factorial of " + number3 + " is: " + Lab1.factorial(number3)); // Output: 120

        // Test for Fibonacci calculation
        int number4 = 5;  // Renamed to avoid conflict
        System.out.println("Fibonacci of " + number4 + " is: " + Lab1.fibonacci(number4)); // Output: 5

        // Test for power calculation
        int base = 2;
        int exponent = 10;
        System.out.println(base + " raised to the power " + exponent + " is: " + Lab1.power(base, exponent)); // Output: 1024

        // Test for reverse print using recursion
        int[] numbers7 = {1, 4, 6, 2};

        System.out.print("Reversed array: ");

        Lab1.reversePrint(numbers7, numbers7.length - 1);

        System.out.println();

        // Test for digit-only string check
        String str1 = "123456";
        String str2 = "123a12";

        System.out.println("Is \"" + str1 + "\" all digits? " + Lab1.isOnlyDigits(str1, 0)); // true
        System.out.println("Is \"" + str2 + "\" all digits? " + Lab1.isOnlyDigits(str2, 0)); // false

        // Test for binomial coefficient
        int n1 = 2, k1 = 1;
        int n2 = 7, k2 = 3;

        System.out.println("C(" + n1 + ", " + k1 + ") = " + Lab1.binomial(n1, k1)); // 2
        System.out.println("C(" + n2 + ", " + k2 + ") = " + Lab1.binomial(n2, k2)); // 35


    }
}
