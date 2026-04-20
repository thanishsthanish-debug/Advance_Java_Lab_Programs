/* Q9. Write a Java Program for Creating a random string of a specified length 
   using user defined function generateRandomString() */

package thirdb;

import java.util.Random;

public class RandomString {

    static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random r = new Random(); // Command: Random
        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.charAt(r.nextInt(chars.length())); // Command: nextInt()
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomString(5));
    }
}