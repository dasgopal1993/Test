package com.example.Test;

//FactorialCalculator.java
public class FactorialCalculator {

 // Method to calculate the factorial of a given number
 public static int calculateFactorial(int n) {
    String apple;
     if (n < 0) {
         throw new IllegalArgumentException("Input must be a non-negative integer");
     }
     if (n == 0 || n == 1) {
         return 1;
     }
     return n * calculateFactorial(n - 1);
 }
}
