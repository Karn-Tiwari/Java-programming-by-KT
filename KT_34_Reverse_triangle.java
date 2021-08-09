package com.company;

import java.util.Scanner;

public class KT_34_Reverse_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n-1; j++)
                System.out.println(" ");

            for (int j=1; j<=i; j++)
                System.out.print("*");
            System.out.println();

        }

    }
}
