package com.company;

public class NonRecursionFactorial {
    public static void main(String[] args) {
        System.out.println(NonFactorial(7));
    }
    private static int NonFactorial (int n) {

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
