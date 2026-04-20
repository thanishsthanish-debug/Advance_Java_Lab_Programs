/* Q4. Write a Java Program for Checking if a string reads the same backward as forward 
   (ignoring case and punctuation) using user defined function isPalindrome() */

package thirdb;

public class PalindromeCheck {

    static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase(); // Command: replaceAll()
        String rev = new StringBuilder(clean).reverse().toString();   // Command: reverse()
        return clean.equals(rev); // Command: equals()
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam"));
    }
}