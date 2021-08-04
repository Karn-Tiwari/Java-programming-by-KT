package com.company;

import java.util.Scanner;

public class KT_27_max_min_integer {
    public static void main(String[] args) {
        // Write a program which reads a sequence of positive integer.
        // The programs stops when the user fills negative value and shows
        // the maximum and minimum value of these numbers
        //example- 6 0 3 9 -4 --> max = 9, min = 0 whenever we enter -ve value we stop the program
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
       int n = s.nextInt();

        int max = n;
        int min = n;
        if (n>=0) {
            while (true) {
                n = s.nextInt();

                if (n < 0)
                    break;

                if (n > max)
                    max = n;

                if (n < min)
                    min = n;

            }
            System.out.println("min=" + min + " ,max= " + max);

        }
        System.out.println(n + "is invalid");
        }

}

/*
inside the loop we can also write in that way

                   n = s.nextInt();

                    if(n<o)
                    break;

                    max = n > max ? n : max;
                    min = n < min ? n : min;
*/