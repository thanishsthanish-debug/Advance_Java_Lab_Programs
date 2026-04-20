/* Q2. Write a Java Program for Counting how many times a substring appears in a main string 
   using user defined function countOccurrences() */

package thirdb;

public class CountOccurrences {

    static int countOccurrences(String mainStr, String subStr) {
        int count = 0, index = 0;

        while ((index = mainStr.indexOf(subStr, index)) != -1) { // Command: indexOf()
            count++;
            index += subStr.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences("java java java", "java"));
    }
}