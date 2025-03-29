package org.lab1.Main;

public class Main {

    public static void main(String[] args) {
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


    }
}
