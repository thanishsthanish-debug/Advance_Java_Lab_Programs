/* Q3. Write a Java Program for Reversing the characters in a string 
   using user defined function reverseString() */

package thirdb;

public class ReverseString {

    static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString(); // Command: reverse()
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Java"));
    }
}