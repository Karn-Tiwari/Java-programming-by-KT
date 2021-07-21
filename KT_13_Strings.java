package com.company;
import java.util.Scanner;
public class KT_13_Strings {
    public static void main(String[] args) {
    /*  String name = new String("karn tiwari");

// NOTE- String me changement nhi kar sakte but uski copy bana k changement kar sakte hai

         String name = "Karn Tiwari";
         // This is method is also very common to making string

        System.out.print("The name is :");
        // ye output print but new line generate nhi karega

        System.out.println(name);
        // ye output print karega and new line generate kerega

     */

        /*
         int a = 6;
        float b = 4.7564f;
        System.out.printf("The value of a is %d and the value of b is %f", a, b);
        System.out.format("The value of a is %d and the value of b is %f",a,b);
        */

        /*
    %d and %f are Formate specifier
    %d is for int
    %f is for floating point number like decimal number
*/
        Scanner sc = new Scanner(System.in);
        // hum user se input le sakte hai and terminal me sirf 1st word print hoga chahe hum ek word likhe ya poori line
        // System.out.println(st);
        String st = sc.nextLine();// isme user ki poori line copy hoke print ho jayegi
        System.out.println(st);
    }
}
