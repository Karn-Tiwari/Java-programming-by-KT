package com.company;

import java.util.Scanner;

public class KT_29_Fibonacci_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = s.nextInt();

        int result = 0;
        int v1 = 1;
        int v2 = 2;
        for (int i = 1; i <= n-2; i++)
        {
            result = v1 + v2;
            v1 = v2;
            v2 = result;
        }
        System.out.println("Result=" + (result == 0 ? 1 : result));
    }
}
