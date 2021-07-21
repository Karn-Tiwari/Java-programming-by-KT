package com.company;

public class KT_09_CH2_OP_Precedence_and_Associativity {
    public static void main(String[] args) {
//       int a = 60*5-34/2;//Precedence
       /*
       =300-34/2
       =300_17
       =287
        */
//        int b = 60/5-34*2;// Associativity
        /*
        =12-34*2
        =12-68
        =-56
         */
//        System.out.println(a);
//        System.out.println(b);

       // Quick Quiz
        int a = 1;
        int b = 5;
        int c = 4;
        int k = (b*b-4*a*c)/2*a;
        System.out.println(k);

    }
}
