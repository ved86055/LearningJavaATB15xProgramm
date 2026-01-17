package Strings;

import java.util.Locale;

public class String_All_Functions
{
    public static void main(String[]args) {



        //1.Concat
        String s="Hello";
        s=s.concat("world");
        System.out.println(s);

        // Concat 3 string
        String s21 = "Hello";
        String s22 = "Java";
        String s23 = "World";
        System.out.println(s21.concat(s22)+s22.concat(s23));



        //2.toUpperCase

        String name="abcdefgh";
      //  name=name.toUpperCase();
        System.out.println(name.toUpperCase());

       // 3.lower case

        String company="ARATI";
      //  company=company.toLowerCase(Locale.ROOT);
        System.out.println(company.toLowerCase());

        //4.length

        String s1="Laptop";
        System.out.println(s1.length());
        System.out.println("___________________");
        //5.equals
        String s2="hello";
        String s3="hello";
        System.out.println(s2.equals(s3));
        System.out.println(s2=s3);


   /*


        //6.equalsIgnore
        String s4="ved";
        String s5="Ved";
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));

        //7.contains

        String s6="velocity";
        System.out.println(s6.contains("el"));
        System.out.println(s6.contains("abc"));
        */

        //8.isEmpty

        String s7="";
        System.out.println(s7.isEmpty());

        //9.CharAt
        String s8="CountryDelight";
        System.out.println(s8.charAt(0));

        //10. Indexof
        String s9="Aliens";
        System.out.println(s9.indexOf("Al"));

        //11.lastIndexOf
        String s10="EnclaveEnclave";
        System.out.println(s10.lastIndexOf("ve"));  //12 bcz v at 12th  (looks at the last occurance)
        System.out.println(s10.indexOf("ve"));    //(looks at 1st occurence 5th is 1st

        //12.startsWith

        String s11="vedprakash";
        System.out.println(s11.startsWith("v"));


        //13.endsWith
        String s12="vedprakash";
        System.out.println(s12.endsWith("s"));

        //14.substring

        String s13="vedprakash";
        System.out.println(s13.substring(5));  //akash
        System.out.println(s13.substring(5,9));   //akas  : 5 >a & 9>h  (starting index inclusive 7 last index exclusive

        //15.Replace

        String s14="my name is ved";
        System.out.println(s14.replace("ved","suraj"));

        //16


























    }

























}
