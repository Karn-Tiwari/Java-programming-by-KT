package com.company;

import java.util.Locale;

public class KT_15_ps3 {
    public static void main(String[] args) {
    // Problem 1-we have to convert a string into lowecase
      String name ="Jack Parker";
      name = name.toLowerCase();
        System.out.println(name);

        //Problem 2-we are replacing string by updating variable
        String text = "To Lower Case";
        text = text.replace("","_");
        System.out.println(text);

        //Problem 3
        String letter = "Dear <|name|>,Thanks a lot";
        letter = letter.replace("<|name|>","Karn");
        System.out.println(letter);

        //Problem 4
        String myString = "This string contains double space  and triple sapce";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        //Problem 5
        String myletter = "Dear Karn,\n\tThis JAVA Course is Awesome.\n\tThank You So Much";
        System.out.println(myletter);
    }
}
