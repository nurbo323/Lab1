# Laboratory Work 1: Recursive Algorithms in Java


**Author**: Amangeldinov Nurbol  
**Project Name**: Lab1  
**Topic**: Recursion, Git, Java Programming, Code Documentation

---

## 📘 Description

This project consists of **10 programming problems** solved in Java.  
Starting from **Problem 3**, all solutions are implemented using **recursion**, as per lab requirements.

Each problem is:
- fully documented using JavaDoc-style comments
- analyzed with time complexity
- tested in a `Main.java` class
- version-controlled using **Git**
- committed individually for traceability and defense

---

## ✅ Tasks Completed

| Problem # | Description                                      | Method Name             | Recursion |
|-----------|--------------------------------------------------|--------------------------|-----------|
| 1         | Find minimum in array                            | `findMinimum`            | ✖️        |
| 2         | Calculate average of array                       | `average`                | ✖️        |
| 3         | Check if number is prime                         | `isPrime`                | ✖️ (optionally recursive) |
| 4         | Calculate factorial                              | `factorial`              | ✔️        |
| 5         | Find nth Fibonacci number                        | `fibonacci`              | ✔️        |
| 6         | Compute aⁿ                                       | `power`                  | ✔️        |
| 7         | Print array in reverse                           | `reversePrint`           | ✔️        |
| 8         | Check if string contains only digits             | `isOnlyDigits`           | ✔️        |
| 9         | Compute binomial coefficient C(n, k)             | `binomial`               | ✔️        |
| 10        | Find GCD using Euclidean algorithm               | `gcd`                    | ✔️        |

---

## 🧾 Git Commit Structure

Each problem was committed **individually** to ensure traceability:

- `Add problem 1: find minimum in array`
- `Add problem 2: calculate average value of array`
- ...
- `Add problem 10: GCD using Euclidean algorithm`

✅ Total commits: **11**  
✅ Branch used: `main`

---

## 📚 Documentation

Each method includes:
- Clear JavaDoc comments
- Time complexity annotation
- Parameter descriptions
- Purpose and expected output

Example:

```java
/**
 * This method calculates the factorial of a number using recursion.
 * Time complexity: O(n)
 * @param n The number to find factorial of.
 * @return The factorial of n.
 */
public static int factorial(int n) { ... }


🛠️ Tools Used
Java 17+

IntelliJ IDEA

Git & GitHub

JavaDoc

Console I/O

📁 Project Structure
css
Копировать
Редактировать
Lab1/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── org/
│               └── lab1/
│                   └── Main/
│                       ├── Lab1.java      // All logic
│                       └── Main.java      // All testing
├── README.md
└── pom.xml (if needed)
