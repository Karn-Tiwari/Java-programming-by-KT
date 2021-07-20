package com.company;
import java.util.Scanner;

public class KT_CBSE_Board_Percentage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter maths mark :");
        float maths = scan.nextFloat();
        System.out.println("Enter physics mark :");
        float physics = scan.nextFloat();
        System.out.println("Enter chemistry mark :");
        float chemistry = scan.nextFloat();
        System.out.println("Enter english mark :");
        float english = scan.nextFloat();System.out.println("Enter computer mark :");
        float computer = scan.nextFloat();

        float percentage = ((maths + physics + chemistry + english + computer)/500.0f)*100;

        System.out.print("percentage :");
        System.out.println(percentage);

    }
}
