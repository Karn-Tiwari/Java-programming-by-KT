package com.company;


import javax.swing.*;
import java.util.Scanner;

public class KT_36_starrectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i == 1 || i == n)
            for (int j = 1; j <= n; j++)
                System.out.print("*");
            else
                for (int j = 1; j <= n; j++)
                    if(j == 1 || j == n)
                    System.out.print("*");
                    else
                        System.out.print(" ");
            System.out.println();
        }
    }
}
