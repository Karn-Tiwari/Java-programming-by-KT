package com.company;

import java.util.Scanner;

public class KT_26_Prime_number {
    public static void main(String[] args) {
        // Write a program which reads a positive number N from the user then indicates if N is prime or not.
        // 1- Iterate over all the possible divisor except 1 and N
        //2- If i is a divisor of N, then N is not Prime
        //3-N is Prime if no divisors were found

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();

        for (int i=2; i <n/2; i++)
            if(n % i == 0)
            {
                System.out.println("It is not a PRIME NUMBER");
                break;
            }
        else{
                System.out.println("It is a PRIME NUMBER");
                break;
            }


    }
}
