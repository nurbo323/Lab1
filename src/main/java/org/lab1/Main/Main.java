package org.lab1.Main;

public class Main {
    public static void main(String[] args) {

        // Problem 1: Find Minimum
        int[] numbers1 = {10, 1, 32, 3, 45};
        System.out.println("Minimum in array: " + Lab1.findMinimum(numbers1)); // 1

        // Problem 2: Average
        int[] numbers2 = {3, 2, 4, 1};
        System.out.println("Average of array: " + Lab1.average(numbers2)); // 2.5

        // Problem 3: Prime check
        int number3a = 7;
        int number3b = 10;
        System.out.println("Is " + number3a + " Prime? " + Lab1.isPrime(number3a)); // true
        System.out.println("Is " + number3b + " Prime? " + Lab1.isPrime(number3b)); // false

        // Problem 4: Factorial
        int number4 = 5;
        System.out.println("Factorial of " + number4 + " is: " + Lab1.factorial(number4)); // 120

        // Problem 5: Fibonacci
        int number5 = 5;
        System.out.println("Fibonacci of " + number5 + " is: " + Lab1.fibonacci(number5)); // 5

        // Problem 6: Power
        int base = 2;
        int exponent = 10;
        System.out.println(base + " raised to the power " + exponent + " is: " + Lab1.power(base, exponent)); // 1024

        // Problem 7: Reverse Print
        int[] numbers7 = {1, 4, 6, 2};
        System.out.print("Reversed array: ");
        Lab1.reversePrint(numbers7, numbers7.length - 1);
        System.out.println();

        // Problem 8: String digit check
        String str8a = "123456";
        String str8b = "123a12";
        System.out.println("Is \"" + str8a + "\" all digits? " + Lab1.isOnlyDigits(str8a, 0)); // true
        System.out.println("Is \"" + str8b + "\" all digits? " + Lab1.isOnlyDigits(str8b, 0)); // false

        // Problem 9: Binomial Coefficient
        System.out.println("C(2, 1) = " + Lab1.binomial(2, 1)); // 2
        System.out.println("C(7, 3) = " + Lab1.binomial(7, 3)); // 35

        // Problem 10: GCD
        System.out.println("GCD of 32 and 48: " + Lab1.gcd(32, 48)); // 16
        System.out.println("GCD of 10 and 7: " + Lab1.gcd(10, 7));   // 1
    }
}

