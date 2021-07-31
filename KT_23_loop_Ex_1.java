package com.company;
import java.util.Scanner;
public class KT_23_loop_Ex_1 {
    public static void main(String[] args) {
//         QUESTION-1
//         Write a program which prints the even number between 1 to 100
//         in an increasing order as well a decreasing order
//
//        increasing order
//        for (int i=0; i<=100; i++)
//        {
//            if (i%2==0)
//                System.out.println(i + " ");
//        }
//
//        //decreasing order
//        for (int j=0; j<=100; j++)
//        {
//            if (j%2==0)
//                System.out.println(j + " ");
//        }
//    }
//}
// similar for ODD number


// QUESTION-2
// Write a program which reads a sequence of integers from the user and
// stops by displaying "DONE" when the sum of these values exceed 100.

Scanner s = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.print("enter a number: ");
            sum += s.nextInt();
            // jaise jaise enter karte jayenge isme add hota chala jayega jab sum 100
            // se jada hoga tab loop k bahar aa jayega aur toal sum karke print kar dega

            if (sum > 100)
                break;
        }
        System.out.println("DONE: " + sum);
    }
}



