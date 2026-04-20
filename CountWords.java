/* Q10. Write a Java Program for Counting the number of words in a string 
   using user defined function countWords() */

package thirdb;

public class CountWords {

    static int countWords(String str) {
        String[] words = str.trim().split("\\s+"); // Command: split()
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Java is easy"));
    }
}