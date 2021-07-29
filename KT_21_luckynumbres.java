package com.company;

import java.util.Scanner;

public class KT_21_luckynumbres {
    public static void main(String[] args) {
        //A four digit number is called=lucky if A + B = C + D.
        // EXAMPLE 3719 is a lucky number since 3+7=9+1
        //and 4521 is not a lucky number since 4+5=2+1

        Scanner s = new Scanner(System.in);
        System.out.println("enter a four digit number: ");
        int n = s.nextInt();
        if ((n>999 && n<10000)) {
            System.out.println("The number is four digit number");
            //ABCD
            int fourthDigit = n % 10; //D
            int thirdDigit = (n / 10) % 10; // ABC%10 = C
            int secondDigit = (n / 100) % 10; //AB%10 = B
            int firstDigit = (n / 1000) % 10; // A%10 = A

            if (firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.println("Lucky Number..!");
            } else {
                System.out.println("Not Lucky Number..!");
            }
        }
        else{
            System.out.println("The numbre is not a four digit number");
        }

    }
}
