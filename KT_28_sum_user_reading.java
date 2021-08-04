package com.company;

import java.util.Scanner;

public class KT_28_sum_user_reading {
    public static void main(String[] args) {
        // Write a program which displays the sum of digits of an integer read from the user
        // Example:
              //  108 --> 1 + 0 + 8 = 9
             // 1456 --> 1 + 4 + 5 + 6 = 16\
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int sum = 0;
        while (n > 0)
        {
            sum += n % 10;
            n = n/10;
        }
        System.out.print("The sum of digits is:" + sum);
    }
}
