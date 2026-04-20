/* Q1. Write a Java Program for Checking if a given string is null or contains only whitespace 
   using user defined function isNullOrEmpty() */

package thirdb;

public class CheckNullOrEmpty {

    static boolean isNullOrEmpty(String str) { // Command: trim(), isEmpty()
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String str = "   ";
        System.out.println(isNullOrEmpty(str));
    }
}