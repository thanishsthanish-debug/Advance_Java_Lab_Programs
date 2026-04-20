/* Q5. Write a Java Program for Eliminating all whitespace characters from a string 
   using user defined function removeWhitespace() */

package thirdb;

public class RemoveWhitespace {

    static String removeWhitespace(String str) {
        return str.replaceAll("\\s", ""); // Command: replaceAll()
    }

    public static void main(String[] args) {
        System.out.println(removeWhitespace("Java Programming"));
    }
}