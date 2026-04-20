/* Q7. Write a Java Program for Shortening a string to a specified length 
   and adds an ellipsis using user defined function truncate() */

package thirdb;

public class TruncateString {

    static String truncate(String str, int length) {
        if (str.length() <= length) return str; // Command: length()
        return str.substring(0, length) + "..."; // Command: substring()
    }

    public static void main(String[] args) {
        System.out.println(truncate("Java Programming", 5));
    }
}