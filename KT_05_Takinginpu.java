package com.company;
import java.util.Scanner; //ye ek class hai
public class KT_05_Takinginpu {
    public static void main(String[] args) {
        System.out.println("Taking inputs from the user");
        Scanner sc = new Scanner(System.in); // aur uss given class me maine ek object banay hai
//        System.out.println("Enter number 1");
////        int a = sc.nextInt();
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
////        int b= sc.nextInt();
//        float b = sc.nextFloat();
////        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of three numbers is");
//        System.out.println(sum);
//

//boolean b1 = sc.hasNextInt(); // ye check karne k liye hota hai ki baat sahi h ki nhi
//        System.out.println(b1);
//        String str = sc.next(); // ye sirf ek word print karega
        String str = sc.nextLine();// ye poori line print karega
        System.out.println(str);
    }
}
