/* Q6. Write a Java Program for Capitalizing the first letter of each word 
   using user defined function capitalizeWords() */

package thirdb;

public class CapitalizeWords {

    static String capitalizeWords(String str) {
        String[] words = str.split(" "); // Command: split()
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " "; // Command: toUpperCase()
        }
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeWords("java programming"));
    }
}