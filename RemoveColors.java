/* 2. Write a java program for getting different colors through ArrayList interface 
   and remove the 2nd element and color "Blue" from the ArrayList */

package arraylistprograms;

import java.util.*;

public class RemoveColors {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        colors.remove(1);        // Command: remove(index)
        colors.remove("Blue");   // Command: remove(object)

        System.out.println(colors);
    }
}