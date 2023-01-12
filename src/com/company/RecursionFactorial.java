package com.company;
public class RecursionFactorial {
    public static void main(String[]args) {
        System.out.println(Factorial(7));
    }
    private static int Factorial(int x) {
        if (x == 1) {
            return 1;
        }
            return x * Factorial(x - 1);
    }
}

