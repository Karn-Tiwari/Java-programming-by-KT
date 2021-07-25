package com.company;

import java.util.Scanner;

public class KT_18_elseif {
    public static void main(String[] args) {
        char var = 'g';

        switch (var) {
            case 'r':
                System.out.println("You are going to become adult");
                break;
            case 'c':
                System.out.println("You are  going to join a job");
                break;
            case 'g':
                System.out.println("You are going to retired");
                break;
            default:
                System.out.println("You are going to die");

        }


       /*  int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>45)
        {
            System.out.println("You are experienced");
        }
        else if(age>35)
        {
            System.out.println("You are semi-experienced");
        }
        else if(age>25)
        {
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }

        */
    }
}
