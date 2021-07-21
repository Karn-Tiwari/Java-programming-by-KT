package com.company;

import java.util.Locale;

public class KT_14_String_Methods {
    public static void main(String[] args) {
        String name ="Karn Tiwari";
//        System.out.println(name);
      //  int value = name.length(); // lenth gives number of character present in the string
       // System.out.println(value);

        //String lcstring = name.toLowerCase();//ye capital letter ko small letter me convert kar dega
        // for uppercase viceversa
       //System.out.println(lcstring);

       // String nonTrimmedString = "    karn Tiwari     ";
       // System.out.println(nonTrimmedString);

        //String trimmedString = nonTrimmedString.trim();
        //System.out.println(trimmedString);

        //System.out.println(name.substring(2));
        // substring returns new string starting from given index upto end

      // starting index include hoga but ending excluded hoga

        //System.out.println(name.replace('K','f'));
        // aese hi word ko bhi replace kar sakte hai string me

       // System.out.println(name.startsWith("Ka"));
        // baat sahi to true other wise false

        //System.out.println(name.endsWith("Mar"));

        //System.out.println(name.charAt(0));
        //konsa character hai 0 index pe

        //System.out.println(name.indexOf('r'));
        //r character konsi index pe hai
        //String modifiedName = "Karntiwari";
       // System.out.println(modifiedName.indexOf("rn",1));

        System.out.println(name.equals("karn tiwari"));

        System.out.println(name.equalsIgnoreCase("karn tiwari"));

        // Escape sequence character me ek se jada character hote hai but represent sif ek character karte hai output me string k ander
        System.out.println("I am escape sequence character\" double quote");
        System.out.println("I am escape sequence character\n double quote");
    }
}

