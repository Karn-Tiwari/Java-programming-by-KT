package com.company;

import java.util.Scanner;

public class KT_35_cute_triangle {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <=n; i++) // for number of rows
        {
            for (int j = 1; j <=n - i;j++) // for spacing between the star in one row
                System.out.print(" ");

            for (int j = 1; j <= 2*i-1; j++)// for printing star in all row
                if (i==n)
                    System.out.print("*"); // for 1st row first star
                else
                    if (j == 1 || j == 2*i-1) // in 1st and last row we want to print star without spacing
                        System.out.print("*");
                    else
                        System.out.print(" "); // for spacing

            System.out.println();

        }




    }
}
