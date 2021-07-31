package com.company;

import java.util.Scanner;

public class KT_22_number_1_to_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//       int n = s.nextInt();
//       WHILE LOOP


//        while (n<1 || n>10)
//        {
//            System.out.print(n +" is not between 1 to 10. Try again");
//            n = s.nextInt();
//        }
//        System.out.println(n +" is between 1 to 10");


        // DO WHILE


        //        do {
        //            System.out.println("enter a number between 1 to 10: ");
        //            n = s.nextInt();
        //        }while (n<1 || n>10);WHILE LOOP



       // FOR LOOP

//        System.out.print("Enter a number :" );
//        int n = s.nextInt();
//        for (; n<=10; n++)
//        {
//            System.out.println("Karn tiwari");
//        }

        //NESTED LOOP

//        for (int i=0; i<3; i++) {
//            for (int j = 0; j < 2; j++){
//                System.out.println(i + " " + j);
//                System.out.println();
//        }
//        }
//
// MULTIPLICATION TABLE 1 TO 10
        for (int i= 1; i<=10; i++)
        {
            for (int j= 1; j<=10; j++){
                System.out.println((i*j) + " ");

                System.out.println();
            }
        }

    }
}
