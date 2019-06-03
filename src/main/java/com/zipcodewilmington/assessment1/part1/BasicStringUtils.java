package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        char array [] = str.toCharArray();

        array[0] = Character.toUpperCase(array[0]);
        String string = new String(array);

        return string;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse = "";
        StringBuilder string = new StringBuilder(str);
        string = string.reverse();
        reverse = string.toString();

        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversestr = reverse(str);
        reversestr = camelCase(reversestr);

        return reversestr;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String removeChar = "";
        for(int i =1; i < str.length()-1; i++)
        {
            removeChar += str.charAt(i) + "";
        }
        return removeChar;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        String inverted = "";

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) == 32)
            {
                inverted += str.charAt(i);
            }
            else if(str.charAt(i) < 97)
            {
                String cc = str.charAt(i) + "";
                cc = cc.toLowerCase();
                inverted += cc;
            }
            else
            {
                String cc = str.charAt(i) + "";
                cc = cc.toUpperCase();
                inverted += cc;
            }
        }
        return inverted;
    }
}
