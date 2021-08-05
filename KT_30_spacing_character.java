package com.company;

public class KT_30_spacing_character {
    public static void main(String[] args) {
        // Write a program which displays a string with a space after each character
        //Example:
        // some text -> s o m e  t e x t
        String str = "some text";

        for (int i = 0; i <= str.length() - 1; i++)
        {
            System.out.print(str.charAt(i) + " ");
        }

    }
}
