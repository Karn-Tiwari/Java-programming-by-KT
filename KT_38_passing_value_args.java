package com.company;

import java.awt.*;


public class KT_38_passing_value_args {
   /* public static void main(String[] args) {

        Point p1 = new Point();

        p1.x = 1;
        p1.y = 2;
        System.out.println("x= " + p1.x + " , y = " + p1.y);

        change (p1);
        System.out.println("x= " + p1.x + " , y = " + p1.y);

    }

    private static void change(Point p) {
        p.x = 2;
        p.y = 1;
    }

    */
/*
    public static void main(String[] args) {
        sayHi(); // Hi
         sayHi("Karn Tiwari") ;  // Hi Karn Tiwari
    }

    public static void sayHi() {
        System.out.println("Hi");
    }
    public static void sayHi(String name) {
        System.out.println("Hi " + name);

 */

    // Methods overloading
    // isme ek hi naam ka bht method rahega but
    // kaam sabka alag alag rahega kuki usme parameters
    // badal diya jayega kabhi int to
    // kabhi string to character aur alag alag
    // call se saare method ko call kar liye jayega
    // and Arguements are actual value with in calling


    // Return type same karke 2 baar method nhi likh sakta
    // kuki this is not possible error through karega


    //VARARGS..
    static int sum(int...arr) {
        int result = 0;
        for (int a : arr){
            result += a;
    }
    return result;
    }
/*
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }


 */
    public static void main(String[] args) {
        System.out.println("Welcome to varargs tutorial");
        System.out.println("The sum of 4 and 5 is : " + sum( 4, 5));
        System.out.println("The sum of 4, 5, and 1 is : " + sum( 4, 5, 1));
        System.out.println("The sum of  4, 5, 1, 6,7 : " + sum( 4, 5, 1, 6, 7));
    }

}



