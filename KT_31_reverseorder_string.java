package com.company;

public class KT_31_reverseorder_string {
    public static void main(String[] args) {
        String str = "some text";
        String reverse = "";

        for (int i = str.length()-1; i>=0; i--)
        {
            reverse += str.charAt(i);  // reverse = reverse + str.CharAt(i)

        }
        System.out.println(reverse);
    }
}
