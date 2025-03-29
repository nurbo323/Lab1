package org.lab1.Main;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        System.out.println("Minimum: " + Lab1.findMinimum(arr)); // 1

        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Average: " + Lab1.average(arr2)); // 2.5

        System.out.println("Is 7 Prime? " + Lab1.isPrime(7)); // true
        System.out.println("Is 10 Prime? " + Lab1.isPrime(10)); // false

    }
}

