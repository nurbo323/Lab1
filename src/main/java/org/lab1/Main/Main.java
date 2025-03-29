package org.lab1.Main;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Minimum: " + Lab1.findMinimum(arr)); // 1

        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Average: " + Lab1.average(arr2)); // 2.5


        int number1 = 7;
        System.out.println("Is " + number1 + " Prime? " + Lab1.isPrime(number1)); // true


        int number2 = 10;
        System.out.println("Is " + number2 + " Prime? " + Lab1.isPrime(number2)); // false


        int number = 5;
        System.out.println("Factorial of " + number + " is: " + Lab1.factorial(number)); // Output: 120


    }
}

