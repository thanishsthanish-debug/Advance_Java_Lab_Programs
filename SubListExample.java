/* 4. Write a java program for getting different colors through ArrayList interface 
   and extract the 1st and 2nd elements using subList() */

package arraylistprograms;

import java.util.*;

public class SubListExample {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        List<String> sub = colors.subList(0, 2); // Command: subList(start, end)

        System.out.println("Sublist: " + sub);
    }
}