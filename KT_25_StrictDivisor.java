package com.company;

import java.util.Scanner;

public class KT_25_StrictDivisor {
    public static void  main(String[] args) {
        //QUESTION - 1
        // Write a program which determines the strict divisors of an integer given by the user
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = 0;
        for ( int i = 1; i<=n/2; i++)
        {
            if (n%i==0)
                sum +=i;

        }
          System.out.println(sum);
       // System.out.print( i , " ");
        // STRICT DIVISOR=> (i) The strict divisor of a number N are <=N/2
        //(ii) If N % i = 0, then i is a divisor of N

    }
}