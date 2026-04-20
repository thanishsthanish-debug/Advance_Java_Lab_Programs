/* Q8. Write a Java Program for Verifying if a string contains only numeric characters 
   using user defined function isNumeric() */

package thirdb;

public class CheckNumeric {

    static boolean isNumeric(String str) {
        return str.matches("\\d+"); // Command: matches()
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12345"));
    }
}