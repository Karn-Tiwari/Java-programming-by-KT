package com.company;

import java.util.Scanner;

public class KT_19_prac_set_chap_4 {
    public static void main(String[] args) {
      /*  //QUESTION -1
        byte m1 , m2 , m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in maths");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3)/3.0f;
        System.out.println("You overall percentage is :" + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33 ) {
            System.out.println("Congratulation you are promoted");
        }
            else {
                System.out.println("You are not been promoted");


        }

       */
            // QUESTION -2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your income in lakhs pre annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if (income<2.5) {
//                tax = tax + 0;
//            }
//            else if(income>2.5 && income < 5f)
//            {
//                tax = tax + 0.05f*(income-2.5f);
//            }
//            else if(income>5f && income < 10.0f)
//        {
//            tax = tax + 0.05f*(5f-2.5f);
//            tax = tax + 0.2f*(income - 5f);
//        }
//            else if(income>10.0f)
//        {
//            tax = tax + 0.05f*(5f-2.5f);
//            tax = tax + 0.2f*(10f- 5f);
//            tax = tax + 0.3f*(income-10f);
//        }
//        System.out.println("The total tax paid by the emoloyee is :" + tax);
//
//

        //QUESTION - 4
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day)
//        {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        //QUESTION -5
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the year");
//        int year = sc.nextInt();
//
//        if(year%400==0) {
//            System.out.println("The year is a leap year");
//        }
//          else if(year%100==0){
//            System.out.println("The year is not a leap year");
//        }
//          else if(year%4==0)
//        {
//            System.out.println("The year is a leap year");
//
//        }
//          else{
//            System.out.println("The year is not a leap year");
//        }


        // QUESTION -6
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com"))
        {
            System.out.println("This is a commercial website");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("This is a organizational website");
        }
        else if (website.endsWith(".in"))
        {
            System.out.println("This is institutional website");
        }



    }
}
