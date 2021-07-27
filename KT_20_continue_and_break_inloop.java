package com.company;
import  java.util.Scanner;
public class KT_20_continue_and_break_inloop {
    public static void main(String[] args) {
//        //Break and continue using loops
//        for (int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("Java is awesome language");
//            if (i==2)
//            {
//                System.out.println("Ending the loop");
//                break;//break statement ki wajah se loop se bahar aa jayenge chahe condintion true ho ya false
//
//            }
//        }
//        System.out.println("Loop is ending here");
//
//
//
//
//
//        for (int i=0;i<5;i++){
//            if (i==2) {
//                System.out.println("Ending the loop");
//                continue;
//            }
//            // jab i==2 hoga tabhi loop chalega aur phir contiue ki wajah se agee execute nhi hoga again calling loop me jayegi aur phir se condition check hogi
//
//                System.out.println(i);
//                System.out.println("Java is awesome language");
//            }

        int n;
        Scanner s = new Scanner(System.in);
        while (true)
        {
            System.out.println("enter a number between 1 to 10: ");
            n = s.nextInt();

            if(n<1 || n>10)
                continue;
            System.out.println(n + " is between 1 to 10");
            break;
        }


        }
    }

