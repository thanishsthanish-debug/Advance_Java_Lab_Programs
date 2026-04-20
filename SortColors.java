/* 3. Write a java program for getting different colors through ArrayList interface 
   and sort them using Collections.sort() */

package arraylistprograms;

import java.util.*;

public class SortColors {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        Collections.sort(colors); // Command: Collections.sort()

        System.out.println("Sorted list: " + colors);
    }
}